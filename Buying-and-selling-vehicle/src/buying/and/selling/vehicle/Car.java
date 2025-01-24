package buying.and.selling.vehicle;

public class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, double price, int doors) {
        super(make, model, price);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Car: %s %s | Price: $%.2f | Doors: %d%n", getMake(), getModel(), getPrice(), doors);
    }
}