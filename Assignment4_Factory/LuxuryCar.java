/**
 * @author Peyton Tucker
 * An extension of the Car class for cars of the type Luxury.
 */
public class LuxuryCar extends Car {

    public LuxuryCar(String make, String model) {
        super(make, model);
    }

    /**
     * Adds a frame to the LuxuryCar object. Overrides addFrame() in the Car class.
     */
    @Override
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Adds a special luxury engine to the LuxuryCar object. Overrides addEngine() in the Car class.
     */
    @Override
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }

    /**
     * Adds ten accessories to the LuxuryCar object. Overrides addAccessories() in the Car class.
     */
    @Override
    protected void addAccessories() {
        this.accessories.add(Accessories.FLOOR_MATTS);
        this.accessories.add(Accessories.PHONE_CHARGER);
        this.accessories.add(Accessories.BACK_UP_CAMERA);
        this.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        this.accessories.add(Accessories.HEATED_SEATS);
        this.accessories.add(Accessories.SPORTS_SEATS);
        this.accessories.add(Accessories.WINDOW_TINT);
        this.accessories.add(Accessories.HIGH_END_SOUND);
        this.accessories.add(Accessories.TRUNK_ORGANIZER);
        this.accessories.add(Accessories.BLUE_TOOTH);
    }
    
}
