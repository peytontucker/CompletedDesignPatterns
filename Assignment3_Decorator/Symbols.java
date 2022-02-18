package Assigment3_Decorator;

/**
 * An extension of the PasswordDecorator class which is intended to add symbols to a 
 * passwordBeginning object's password field (and then assign it to this object's password field).
 * @author Peyton Tucker
 */
public class Symbols extends PasswordDecorator {

    /**
     * Instantiates a new Symbols object with a password object.
     * @param passwordBeginning the Password object whose password field serves as the basis for mutation.
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Mutates the password field of this object's passwordBeginning field, assigns it to this object's password field, and returns it. 
     * Mutation is done by converting select letters to corresponding symbols.
     */
    @Override
    public String getPassword() {
        char[] symbolPassword = this.passwordBeginning.password.toCharArray(); //converts this password field of passwordBeginning to an iterable char array.

        for (int i = 0; i < symbolPassword.length; i++) { //iterates through each character and replaces appropriate characters with their corresponding symbol
            switch (symbolPassword[i]) { 
                case 'a':
                    symbolPassword[i] = '@';
                    break;
                case 'b':
                    symbolPassword[i] = '8';
                    break;
                case 'e':
                    symbolPassword[i] = '3';
                    break;
                case 'g':
                    symbolPassword[i] = '9';
                    break;
                case 'i':
                    symbolPassword[i] = '!';
                    break;
                case 'o':
                    symbolPassword[i] = '0';
                    break;
                case 's':
                    symbolPassword[i] = '$';
                    break;
                case 't':
                    symbolPassword[i] = '7';
                    break;
            }
        }

        this.password = charArrayToString(symbolPassword); //converts char array back to string and assigns it to this object's password field.
        return this.password;
    }
    

}
