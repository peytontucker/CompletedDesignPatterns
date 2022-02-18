/**
 * @author Peyton Tucker
 * An extension of the Car class for cars of the type Small.
 */
public class SmallCar extends Car{

    public SmallCar(String make, String model) {
        super(make, model);
    }

    /**
     * Adds a frame to the SmallCar object. Overrides addFrame() in the Car class.
     */
    @Override
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    /**
     * Adds two accessories to the SmallCar object. Overrides addAccessories() in the Car class.
     */
    @Override
    protected void addAccessories() {
        this.accessories.add(Accessories.FLOOR_MATTS);
        this.accessories.add(Accessories.PHONE_CHARGER);
    }
    
}
