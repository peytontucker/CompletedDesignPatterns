public class QuitCommand implements Command {

    public QuitCommand() {

    }
    
    @Override
    public void execute() {
        System.out.println("Hope you had fun. Goodbye!");
        System.exit(0);
        
    }
    
}
