package Assigment3_Decorator;

import java.util.regex;
import java.util.Random;

/**
 * Simple implementation of the Password class which removes whitespace and adds numbers to the end of a password.
 * @author Peyton Tucker
 */
public class EasyPassword extends Password {

    /**
     * Constructor which removes whitespace from the desired password and adds a number to the end of it.
     * @param phrase the password phrase to be manipulated
     */
    public EasyPassword(String phrase) {
        String manipulatedPhrase = phrase;

        manipulatedPhrase = manipulatedPhrase.replaceAll("\\s+",""); //removes whitespace using regex. *see note

        Random rand = new Random();
        manipulatedPhrase += Integer.toString(rand.nextInt(101)); //appends a random integer 1-100 to end of phrase //test if Integer.toString is needed here TODO

        this.password = manipulatedPhrase;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}

//* learned how to remove whitespace from the following resource: https://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java