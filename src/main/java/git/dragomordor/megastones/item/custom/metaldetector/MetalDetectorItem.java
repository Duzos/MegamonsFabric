package git.dragomordor.megastones.item.custom.metaldetector;

import git.dragomordor.megastones.util.ModTags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class MetalDetectorItem extends Item {

    // scanRange defines how many blocks around usePosition should be scanned
    // fe. if its 5, it will scan ((5*2) + 1)^3 area, with usePosition in 3d middle
    private static final int scanRange = 5;

    public MetalDetectorItem() {
        super(new FabricItemSettings().maxCount(1));
    }
    List<PosState> valuablesPosState;
    List<PosState> blocksToRevert;

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos positionClicked = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        if(!context.getWorld().isClient() && player.isSneaking()) {
            float forwardSpeed = 0.3f;
            float sidewaysSpeed = 0.0f;

            player.setVelocity(forwardSpeed, player.getVelocity().y, sidewaysSpeed);

        }
        else if(!context.getWorld().isClient()) {
            boolean foundBlock = false;

            int x, y, z;
            valuablesPosState = new ArrayList<>();
            blocksToRevert = new ArrayList<>();

            // Scan Every Block in scanRange for Valuables,
            // and Save Every True Condition to valuablePosState
            for(x = 0; x <= scanRange; x++) {
                BlockPos scanPosX;

                // test X+
                scanPosX = positionClicked.east(x);
                for(z = 0; z <= scanRange; z++) {
                    BlockPos scanPosZ;
                    // test X+ Z+
                    scanPosZ = scanPosX.south(z);
                    for(y = 0; y <= scanRange; y++) {
                        BlockState state;
                        BlockPos scanPosY;
                        float distance = calculateDistanceXYZ(x, y, z);

                        // test X+ Z+ Y+
                        scanPosY = scanPosZ.up(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);

                        // test X+ Z+ Y-
                        scanPosY = scanPosZ.down(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);
                    }

                    // test X+ Z-
                    scanPosZ = scanPosX.north(z);
                    for(y = 0; y <= scanRange; y++) {
                        BlockState state;
                        BlockPos scanPosY;
                        float distance = calculateDistanceXYZ(x, y, z);

                        // test X+ Z- Y+
                        scanPosY = scanPosZ.up(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);

                        // test X+ Z- Y-
                        scanPosY = scanPosZ.down(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);
                    }
                }

                // test X-
                scanPosX = positionClicked.west(x);
                for(z = 0; z <= scanRange; z++) {
                    BlockPos scanPosZ;
                    // test X- Z+
                    scanPosZ = scanPosX.south(z);
                    for(y = 0; y <= scanRange; y++) {
                        BlockState state;
                        BlockPos scanPosY;
                        float distance = calculateDistanceXYZ(x, y, z);

                        // test X- Z+ Y+
                        scanPosY = scanPosZ.up(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);

                        // test X- Z+ Y-
                        scanPosY = scanPosZ.down(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);
                    }

                    // test X- Z-
                    scanPosZ = scanPosX.north(z);
                    for(y = 0; y <= scanRange; y++) {
                        BlockState state;
                        BlockPos scanPosY;
                        float distance = calculateDistanceXYZ(x, y, z);

                        // test X- Z- Y+
                        scanPosY = scanPosZ.up(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);

                        // test X- Z- Y-
                        scanPosY = scanPosZ.down(y);
                        state = context.getWorld().getBlockState(scanPosY);
                        handleScan(state, scanPosY, distance, player);
                    }
                }
            }

            // continue if ANY valuable found
            if(!valuablesPosState.isEmpty()) {
                foundBlock = true;
                // get some reference
                PosState closestValuablePosState = valuablesPosState.get(0);

                // run through all valuables to find the closest one,
                // save it as closestValuablePosState
                for (PosState posState : valuablesPosState) {
                    if(posState.distance < closestValuablePosState.distance) {
                        closestValuablePosState = posState;
                    }
                }
                outputValuableCoordinates(closestValuablePosState.pos, player,
                        closestValuablePosState.state.getBlock(), closestValuablePosState.distance, valuablesPosState.size());

// xray stuff
                // set blocks to barrier
                for (PosState revertPos : blocksToRevert) {
                    player.getWorld().setBlockState(revertPos.pos, Blocks.BARRIER.getDefaultState());
                }

                // set blocks back to what they were after 3 sec
                new revertBlocksAfterXSeconds(blocksToRevert, player, 3000).run();

                // give player night vision for 3 sec
                StatusEffectInstance nightVisionEffect = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3 * 20, 0, false, false);
                player.addStatusEffect(nightVisionEffect);

            }
            if(!foundBlock) {
                player.sendMessage(Text.literal("No Valuables Found!"));
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void chatLog(PlayerEntity player, String text) {
        player.sendMessage(Text.literal(text));
    }

    private float calculateDistanceXYZ(int x, int y, int z) {
        double xSquared = ((double) x);
        xSquared *= xSquared;

        double ySquared = ((double) y);
        ySquared *= ySquared;

        double zSquared = ((double) z);
        zSquared *= zSquared;


        return (float) Math.sqrt( xSquared + ySquared + zSquared );
    }
    private void handleScan(BlockState state, BlockPos scanPos, float distance, PlayerEntity player) {
        if (isValuableBlock(state)) {
            // Check, if posBlock already Exists in valuablesPosState
            boolean posExists = checkIfPosExists(scanPos, valuablesPosState);

            // Add only when such posBlock haven't been added already
            if (!posExists) {
                valuablesPosState.add(new PosState(state, scanPos, distance));
            }
        } else if(state.isIn(ModTags.Blocks.METAL_DETECTOR_DESTROYABLE_BLOCKS)) {
            boolean posExists = checkIfPosExists(scanPos, blocksToRevert);

            // Add only when such posBlock haven't been added already
            if (!posExists) {
                blocksToRevert.add(new PosState(state, scanPos, distance));
            }
        }
    }

    private boolean checkIfPosExists(BlockPos givenPos, List<PosState> posStateList) {
        boolean posExists = false;
        for (PosState posState : posStateList) {
            if (posState.pos.equals(givenPos)) {
                posExists = true;
                break;
            }
        }
        return posExists;
    }

    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, RoundingMode.HALF_UP);
        return bd;
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block block, float distance, int amount) {
        player.sendMessage(Text.literal("From " + amount + " Valuable Blocks, Found " + block.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + "), Just " + round(distance, 2) + " blocks away!"), false);
    }

    private boolean isValuableBlock(BlockState state) {
        return state.isIn(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS);
    }
}
