package git.dragomordor.megastones.item.custom.metaldetector;

import net.minecraft.entity.player.PlayerEntity;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class revertBlocksAfterXSeconds {
    List<PosState> blocksToRevert;
    PlayerEntity player;
    int delayInMilliseconds;

    public revertBlocksAfterXSeconds(List<PosState> blocksToRevert, PlayerEntity player, int delayInMilliseconds) {
        this.blocksToRevert = blocksToRevert;
        this.player = player;
        this.delayInMilliseconds = delayInMilliseconds;
    }

    Timer timer = new Timer();
    TimerTask task =  new TimerTask() {
        @Override
        public void run() {
            for (PosState revertPos : blocksToRevert) {
                player.getWorld().setBlockState(revertPos.pos, revertPos.state);
            }
        }
    };

    public void run() {
        timer.schedule(task, 3000);
    }
}
