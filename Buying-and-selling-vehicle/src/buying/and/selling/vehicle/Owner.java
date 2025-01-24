package buying.and.selling.vehicle;

import java.util.Scanner;

public class Owner {
    private Scanner scanner;

    public Owner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void performOwnerFunctions() {
        boolean ownerRunning = true;

        while (ownerRunning) {
            System.out.println("\n=== Owner Functions ===");
            System.out.println("1. Register Vehicle for Sale");
            System.out.println("2. Exit Owner Functions");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Vehicle vehicle = registerVehicle();
                    VehicleRegistry.getInstance().addVehicle(vehicle);
                    System.out.printf("%s registered %s %s for sale.%n", "Owner", vehicle.getMake(), vehicle.getModel());
                    break;

                case 2:
                    ownerRunning = false;
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
}