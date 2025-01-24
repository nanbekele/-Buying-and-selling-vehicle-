package buying.and.selling.vehicle;

import java.util.Scanner;

public class Admin {
    private Scanner scanner;

    public Admin(Scanner scanner) {
        this.scanner = scanner;
    }

    public void performAdminFunctions() {
        boolean adminRunning = true;

        while (adminRunning) {
            System.out.println("\n=== Admin Functions ===");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View All Vehicles");
            System.out.println("4. Exit Admin Functions");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Vehicle vehicle = registerVehicle();
                    VehicleRegistry.getInstance().addVehicle(vehicle);
                    System.out.println("Vehicle added successfully!");
                    break;

                case 2:
                    removeVehicle();
                    break;

                case 3:
                    VehicleRegistry.getInstance().displayAllVehicles();
                    break;

                case 4:
                    adminRunning = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private Vehicle registerVehicle() {
        System.out.print("Enter vehicle type (car/bike): ");
        String type = scanner.nextLine();
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        int doorsOrGear = 0;

        if (type.equalsIgnoreCase("car")) {
            System.out.print("Enter number of doors: ");
            doorsOrGear = scanner.nextInt();
        } else if (type.equalsIgnoreCase("bike")) {
            System.out.print("Does it have gear? (1 for Yes, 0 for No): ");
            doorsOrGear = scanner.nextInt();
        }

        return VehicleFactory.createVehicle(type, make, model, price, doorsOrGear);
    }

    private void removeVehicle() {
        System.out.print("Enter make of vehicle to remove: ");
        String removeMake = scanner.nextLine();
        System.out.print("Enter model of vehicle to remove: ");
        String removeModel = scanner.nextLine();
        Vehicle vehicleToRemove = null;

        for (Vehicle v : VehicleRegistry.getInstance().getVehicles()) {
            if (v.getMake().equalsIgnoreCase(removeMake) && v.getModel().equalsIgnoreCase(removeModel)) {
                vehicleToRemove = v;
                break;
            }
        }

        if (vehicleToRemove != null) {
            VehicleRegistry.getInstance().getVehicles().remove(vehicleToRemove);
            System.out.printf("Vehicle %s %s removed from registry.%n", removeMake, removeModel);
        } else {
            System.out.println("Vehicle not found!");
        }
    }
}