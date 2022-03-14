import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.*;

public class Player {

    public Player() {
        System.out.print("Our hero is born");
    }

    public void jump() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("CommandDesignPattern/jump.txt")));
        
        String line = null;

        while ((line = br.readLine()) != null) {
            for (int i = 0; i < 5; i++) {
                line += br.readLine();
            }
            System.out.print(line);
            sleep(100);
            clear();
        }
    }

    public void fire() {
        File fileName = new File("fire.txt");
        Scanner input = new Scanner("fire.txt");
        List<String> list = new ArrayList<String>();
        while (input.hasNextLine()){
            list.add(input.nextLine());
        }

    }

    public void runForward() {
        
    }

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
