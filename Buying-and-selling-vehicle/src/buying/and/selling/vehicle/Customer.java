package buying.and.selling.vehicle;

import java.util.Scanner;

public class Customer {
    private Scanner scanner;

    public Customer(Scanner scanner) {
        this.scanner = scanner;
    }

    public void performCustomerFunctions() {
        boolean customerRunning = true;

        while (customerRunning) {
            System.out.println("\n=== Customer Functions ===");
            System.out.println("1. Buy Vehicle");
            System.out.println("2. View Available Vehicles");
            System.out.println("3. Exit Customer Functions");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    buyVehicle();
                    break;

                case 2:
                    viewAvailableVehicles();
                    break;

                case 3:
                    customerRunning = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void buyVehicle() {
        System.out.print("Enter make of vehicle you want to buy: ");
        String buyMake = scanner.nextLine();
        System.out.print("Enter model of vehicle you want to buy: ");
        String buyModel = scanner.nextLine();
        Vehicle purchasedVehicle = null;

        for (Vehicle v : VehicleRegistry.getInstance().getVehicles()) {
            if (v.getMake().equalsIgnoreCase(buyMake) && v.getModel().equalsIgnoreCase(buyModel)) {
                purchasedVehicle = v;
                break;
            }
        }

        if (purchasedVehicle != null) {
            System.out.printf("You selected the vehicle: %s %s | Price: $%.2f%n", purchasedVehicle.getMake(), purchasedVehicle.getModel(), purchasedVehicle.getPrice());
            System.out.print("Enter the amount you want to pay: ");
            double amountPaid = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (amountPaid >= purchasedVehicle.getPrice()) {
                System.out.printf("You bought the vehicle: %s %s | Price: $%.2f%n", purchasedVehicle.getMake(), purchasedVehicle.getModel(), purchasedVehicle.getPrice());
                VehicleRegistry.getInstance().getVehicles().remove(purchasedVehicle); // Remove from registry
                System.out.printf("Transaction successful! Change: $%.2f%n", amountPaid - purchasedVehicle.getPrice());
            } else {
                System.out.println("Insufficient amount. Transaction failed.");
            }
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    private void viewAvailableVehicles() {
        System.out.println("Available Vehicles:");
        VehicleRegistry.getInstance().displayAllVehicles();
    }
}