/**
 * A singleton class that allows the user to play a simple math game.
 * @author Peyton Tucker
 */

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    
    private static MathGame mathGame;
    private int score = 0;
    private Random rand;
    private Scanner reader;
    private String[] operands = {"+", "-", "*", "/"};

    /**
     * Private constructor which instantiates a new MathGame object, a new Random, and a new Scanner to read user input.
     */
    private MathGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    /**
     * Returns this singleton's instance of MathGame, if it has one. It it doesn't, create one and return it.
     * @return this singleton'e MathGame object
     */
    public static MathGame getInstance() {
        if (mathGame==null) mathGame = new MathGame();
        return mathGame;
    }

    /**
     * A method which determines whether or not the user wants to play the game again; if they don't, then quit and display their score.
     */
    public void play() {
        
        do {

            System.out.print("(P)lay or (Q)uit: ");
            
            String answer = reader.nextLine().toLowerCase();

            //ensures user enters p or q
            while (!(answer.equals("p") || answer.equals("q"))) {
                System.out.print("Sorry, you must enter p or q\n(P)lay or (Q)uit: ");
                answer = reader.nextLine();
            }

            //quits program
            if (answer.equals("q")) {
                System.out.println("You won " + score + " games!\nGoodbye");
                reader.close();
                System.exit(0);
            }
            
            playRound();
        } while (true);

    }

    /**
     * A class that operates each round of the math game. Randomly picks two numbers and an operation, determines the correct answer, asks the user
     * for input, and responds appropriately.
     * @return true if the user answers correctly, and false otherwise
     */
    private boolean playRound() {
        int num1 = rand.nextInt(99) + 1;
        int num2 = rand.nextInt(99) + 1;
        float correctAnswer;

        //randomly choose an operation
        int pickOperation = rand.nextInt(4);
        String operation = operands[pickOperation];

        System.out.print("\nRound answer to 1 decimal place\n" + num1 + " " + operation + " " + num2 + " = ");

        //determine correct answer based on randomly chosen operation
        switch (operation) {
            case "+":
                correctAnswer = num1 + num2;
                break;
            case "-":
                correctAnswer = num1 - num2;
                break;
            case "*":
                correctAnswer = num1*num2;
                break;
            case "/":
                correctAnswer = (float) Math.round(((float)num1/(float)num2)*10)/10;
                break;
            default:
                correctAnswer = 0;
        }

        //block of code to ensure user enters an int
        while(!reader.hasNextFloat()) {
            reader.next();
            System.out.println("Invalid input, please enter a number.");
        }

        //read int
        float input = Float.parseFloat(reader.next());
        reader.nextLine();

        //validate answer
        if (input == correctAnswer) {
            System.out.println("You got it!");
            score++;
            return true;
        } else {
            System.out.println("The correct answer is: " + correctAnswer);
            return false;
        }
    }
}
