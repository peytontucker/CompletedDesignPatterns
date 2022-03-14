import java.util.HashMap;

public class InputHandler {
    
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    public InputHandler(Player player) {
        this.commands.put("jump", new JumpCommand(player));
        this.commands.put("run", new RunCommand(player));
        this.commands.put("fire", new FireCommand(player));
        this.commands.put("quit", new QuitCommand());
    }

    public void buttonPressed(String command) {
        Command com = this.commands.get(command);
        com.execute();
    }

}
