public class FireCommand implements Command {

    private Player player;

    public FireCommand (Player player) {
        this.player = player;
        
    }
    
    @Override
    public void execute() {
        player.fire();
        // TODO Auto-generated method stub
        
    }
    
}
