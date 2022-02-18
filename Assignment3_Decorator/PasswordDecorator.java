package Assigment3_Decorator;

/**
 * Abstract child class of the Password class which serves as a blueprint for further child classes to mutate (decorate) the
 * password field of whichever Password object is passed to them.
 * @author Peyton Tucker
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Exclusively called from the constructors of child classes. Populates their passwordBeginning field with a Password object.
     * @param passwordBeginning the Password object to be mutated
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * Implemented by child classes; mutates the current object's passwordBeginning password field, assigns it to its own password field, and returns it.
     */
    public abstract String getPassword();

    /**
     * Helper method which converts a character array to a string. Concatenates each character of a character array together into a single string.
     * @param array - the character array whose elements are to be joined into a string
     * @return the string consisting of joined characters
     */
    public String charArrayToString(char[] array) {
        String str = "";
        for (char c : array) {
            str += c;
        }
        return str;
    }
}
