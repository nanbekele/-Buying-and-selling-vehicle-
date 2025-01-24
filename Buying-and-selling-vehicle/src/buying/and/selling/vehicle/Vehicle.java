package buying.and.selling.vehicle;

public abstract class Vehicle {
    private String make;
    private String model;
    private double price;

    public Vehicle(String make, String model, double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative.");
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public abstract void displayInfo();

    // Getters
    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
}