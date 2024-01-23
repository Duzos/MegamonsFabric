package git.dragomordor.megastones.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class PosState {

    public BlockState state;
    public BlockPos pos;
    public float distance;

    public PosState(BlockState state, BlockPos pos, float distance) {
        this.state = state;
        this.pos = pos;
        this.distance = distance;
    }
}
