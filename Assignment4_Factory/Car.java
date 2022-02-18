/**
 * @author Peyton Tucker
 * A class to represent cars available for purchase in the CarStore.
 */
import java.util.ArrayList;

public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    /**
     * A constructor to instantiate a new Car object with two parameters.
     * @param make the make of the car object
     * @param model the model of the car object
     */
    public Car(String make, String model) {
        this.make = make; this.model = model;
    }

    /**
     * Assembles this car object by adding each component with its own method.
     */
    public void assemble() {
        this.addFrame();
        this.addWheels();
        this.addEngine();
        this.addWindows();
        this.addAccessories();
        this.displayAccessories();
    }

    /**
     * Abstract method for child classes to override; each one will have their own unique frame to add.
     */
    protected abstract void addFrame();

    /**
     * Prints to the console that wheels are being added.
     */
    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    /**
     * Prints to the console that a standard engine is being added.
     */
    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    /**
     * Prints to the console that windows are being added.
     */
    protected void addWindows() {
        System.out.println("Adding Windows");
    }

    /**
     * An abstract method; child classes will add their own unique combination of accessories depending on their specific type.
     */
    protected abstract void addAccessories();

    /**
     * Displays accessories that have been added to this car object.
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        System.out.print(this.toString());
    }

    /**
     * Overrides toString() to display the contents of a Car in a more reader-friendly format.
     */
    @Override
    public String toString() {
        String ret = "";

        for (Accessories a: this.accessories) {
            ret+= "- " + a.name() + "\n";
        }

        return ret;
    }
}