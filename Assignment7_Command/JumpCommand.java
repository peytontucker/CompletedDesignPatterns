import java.io.IOException;

public class JumpCommand implements Command {
        private Player player;

    public JumpCommand(Player player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        try {
            player.jump();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
