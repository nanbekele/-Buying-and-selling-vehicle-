package buying.and.selling.vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Vehicle Management System ===");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Owner");
            System.out.println("4. Vehicle Info");
            System.out.println("5. Exit");
            System.out.print("Choose your role or option: ");

            int roleChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (roleChoice) {
                case 1:
                    new Admin(scanner).performAdminFunctions();
                    break;

                case 2:
                    new Customer(scanner).performCustomerFunctions();
                    break;

                case 3:
                    new Owner(scanner).performOwnerFunctions();
                    break;

                case 4:
                    displayVehicleInfo();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayVehicleInfo() {
        System.out.println("Registered Vehicles:");
        VehicleRegistry.getInstance().displayAllVehicles();
    }
}