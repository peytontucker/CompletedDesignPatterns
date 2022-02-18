package Assigment3_Decorator;

/**
 * An abstract class to build child classes that can store and return passwords.
 * @author Peyton Tucker
 */
public abstract class Password {
    protected String password;

    /**
     * Abstract getter method to return this object's password.
     */
    public abstract String getPassword();
    
}
