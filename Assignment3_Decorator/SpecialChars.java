package Assigment3_Decorator;

import java.util.ArrayList;
import java.util.Random;

/**
 * An extension of the PasswordDecorator class intended to add random special characters to a password.
 * @author Peyton Tucker
 */
public class SpecialChars extends PasswordDecorator {

    /**
     * Constructs a new SpecialChars object.
     * @param passwordBeginning the Password object whose password field will serve as the basis for mutation.
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Mutates the password field of this object's passwordBeginning field, assigns it to this object's password field, and returns it. 
     * Mutation is done by adding one of six special characters after 30% of the characters in a given password.
     */
    @Override
    public String getPassword() {
        
        ArrayList<Character> specCharPassword = stringToCharArrayList(this.passwordBeginning.password); //converts string of interest into an arraylist of characters.
        char[] specialCharArr = {'*', '!', '%', '+', '.', '{', '}'};

        Random rand = new Random();

        for (int i = 0; i < specCharPassword.size(); i++) { //iterates over each character in the password arraylist.
            int addCharThreshold = rand.nextInt(9);
            int specialCharIndex = rand.nextInt(7);

            if (addCharThreshold < 3) { //if randomly chosen integer from 0-9 is less than 3 (i.e. has a value of 0, 1, or 2), then a symbol is added after the current index. 
                specCharPassword.add(i+1, specialCharArr[specialCharIndex]);
            }
        }
        this.password = charArrayListToString(specCharPassword); //converts char ArrayList back to string and assigns it to this object's password field.
        return this.password;
    }
    
    /**
     * A helper method used to convert a string to an ArrayList of characters.
     * @param string the string to be converted into an ArrayList of characters
     * @return the converted string
     */
    public ArrayList<Character> stringToCharArrayList(String string) {
        ArrayList<Character> charArrayList = new ArrayList<Character>();

        for (int i = 0; i < string.length(); i++) {
            charArrayList.add(string.charAt(i));
        }
        return charArrayList;
    }

    /**
     * A helper method used to convert an arraylist of characters (back) to a string by concatenating each character together.
     * @param array the arraylist whose characters are to be concatenated
     * @return the string of joined characters
     */
    public String charArrayListToString(ArrayList<Character> array) {
        String str = "";
        for (Character c : array) {
            str += c;
        }
        return str;
    }
}
