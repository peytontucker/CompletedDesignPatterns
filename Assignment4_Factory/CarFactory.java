/**
 * @author Peyton Tucker
 * A class to instantiate and assemble different Car types.
 */
public class CarFactory {

    /**
     * A method which creates a car from three possible types and returns the Car object.
     * @param type The type of car to be constructed
     * @param make The make of the car to be constructed
     * @param model The model of the car to be constructed
     * @return the car that was created and assembled
     */
    public static Car createCar(String type, String make, String model) {
        if (type.toUpperCase().equals(CarType.SMALL.name())) {
            System.out.println("Creating a " + make + " " + model);
            Car smallCar = new SmallCar(make, model);
            smallCar.assemble();
            return smallCar;
        } else if (type.toUpperCase().equals(CarType.SEDAN.name())) {
            System.out.println("Creating a " + make + " " + model);
            Car sedanCar = new SedanCar(make, model);
            sedanCar.assemble();
            return sedanCar;
        } else if (type.toUpperCase().equals(CarType.LUXURY.name())) {
            System.out.println("Creating a " + make + " " + model);
            Car luxuryCar = new LuxuryCar(make, model);
            luxuryCar.assemble();
            return luxuryCar;
        } else {
            return null;
        }
    }
}
