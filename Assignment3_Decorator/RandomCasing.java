package Assigment3_Decorator;

import java.util.Random;

/**
 * An extension of the PasswordDecorator class intended to randomize the capitalization of a password.
 * @author Peyton Tucker
 */
public class RandomCasing extends PasswordDecorator {

    /**
     * Constructs a new instance of RandomCasing.
     * @param passwordBeginning - the Password object to be passed to superconstructor.
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Mutates the password field of this object's passwordBeginning field, assigns it to this object's password field, and returns it. 
     * Mutation is done by randomizing capitalization of letters.
     */
    @Override
    public String getPassword() {
        char[] randCasePassword = this.passwordBeginning.password.toCharArray(); //converts this password field of passwordBeginning to an iterable char array.
        Random rand = new Random();
        
        for (int i = 0; i < randCasePassword.length; i++) { //iterates over each char in the password.

            boolean changeCharCase = rand.nextBoolean(); //determines whether or not case will be changed.

            if (Character.isLetter(randCasePassword[i]) && changeCharCase) { //inverts capitalization if the previous boolean returns true, and if the current index at hand is a letter. *see note
                if (Character.isLowerCase(randCasePassword[i])) {
                    randCasePassword[i] = Character.toUpperCase(randCasePassword[i]); 
                } else {
                    randCasePassword[i] = Character.toLowerCase(randCasePassword[i]);
                }
            }
        }

        this.password = charArrayToString(randCasePassword); //converts char array back to string and assigns it to this object's password field.
        return this.password;
    }
    
}

//* learned how to determine whether a character is a letter from the following resource: https://stackoverflow.com/questions/4047808/what-is-the-best-way-to-tell-if-a-character-is-a-letter-or-number-in-java-withou