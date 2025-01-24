package buying.and.selling.vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String type, String make, String model, double price, int doorsOrGear) {
        if (type.equalsIgnoreCase("car")) {
            return new Car(make, model, price, doorsOrGear);
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike(make, model, price, doorsOrGear == 1);
        }
        throw new IllegalArgumentException("Invalid vehicle type.");
    }
}