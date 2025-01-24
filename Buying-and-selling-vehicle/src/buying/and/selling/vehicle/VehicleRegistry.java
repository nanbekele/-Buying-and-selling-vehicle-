package buying.and.selling.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRegistry {
    private static VehicleRegistry instance;
    private List<Vehicle> vehicles;

    private VehicleRegistry() {
        vehicles = new ArrayList<>();
    }

    public static VehicleRegistry getInstance() {
        if (instance == null) {
            instance = new VehicleRegistry();
        }
        return instance;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the registry.");
        } else {
            System.out.println("Vehicles in Registry:");
            for (Vehicle vehicle : vehicles) {
                vehicle.displayInfo();
            }
        }
    }
}