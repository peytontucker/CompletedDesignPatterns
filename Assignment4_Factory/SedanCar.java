/**
 * @author Peyton Tucker
 * An extension of the Car class for cars of the type Sedan.
 */
public class SedanCar extends Car {

    /**
     * Instantiates a SedanCar object with a make and model.
     * @param make the make of the SedanCar
     * @param model the model of the SedanCar
     */
    public SedanCar(String make, String model) {
        super(make, model);
    }

    /**
     * Adds a frame to the SedanCar object. Overrides addFrame() in the Car class.
     */
    @Override
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    /**
     * Adds five accessories to the SedanCar object. Overrides addAccessories() in the Car class.
     */
    @Override
    protected void addAccessories() {
    this.accessories.add(Accessories.FLOOR_MATTS);
    this.accessories.add(Accessories.PHONE_CHARGER);
    this.accessories.add(Accessories.BACK_UP_CAMERA);
    this.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    this.accessories.add(Accessories.HEATED_SEATS);
    }
    
}
