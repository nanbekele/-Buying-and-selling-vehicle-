package buying.and.selling.vehicle;

public class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String make, String model, double price, boolean hasGear) {
        super(make, model, price);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Bike: %s %s | Price: $%.2f | Has Gear: %s%n", getMake(), getModel(), getPrice(), hasGear ? "Yes" : "No");
    }
}