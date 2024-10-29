package com.inventory;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AutomobileInventory {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Automobile> inventory = new ArrayList<>();

    public static void main(String[] args) {
        try {
            boolean running = true;
            while (running) {
                displayMenu();
                int choice = getMenuChoice();
                
                switch (choice) {
                    case 1:
                        addVehicle();
                        break;
                    case 2:
                        updateVehicle();
                        break;
                    case 3:
                        removeVehicle();
                        break;
                    case 4:
                        displayVehicles();
                        break;
                    case 5:
                        saveToFile();
                        break;
                    case 6:
                        running = false;
                        System.out.println("\nThank you for using the Vehicle Inventory System!");
                        break;
                    default:
                        System.out.println("\nInvalid choice. Please try again.");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred in main: " + e.getMessage());
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Vehicle Inventory System ===");
        System.out.println("1. Add New Vehicle");
        System.out.println("2. Update Vehicle");
        System.out.println("3. Remove Vehicle");
        System.out.println("4. Display All Vehicles");
        System.out.println("5. Save to File");
        System.out.println("6. Exit");
        System.out.print("Enter your choice (1-6): ");
    }

    private static int getMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static void addVehicle() {
        try {
            System.out.println("\n=== Add New Vehicle ===");
            System.out.print("Enter make: ");
            String make = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter mileage: ");
            int mileage = Integer.parseInt(scanner.nextLine());

            Automobile newAuto = new Automobile(make, model, color, year, mileage);
            inventory.add(newAuto);
            System.out.println("\nVehicle successfully added to inventory");
        } catch (NumberFormatException e) {
            System.out.println("\nError: Year and mileage must be numbers.");
        }
    }

    private static void updateVehicle() {
        if (inventory.isEmpty()) {
            System.out.println("\nNo vehicles in inventory.");
            return;
        }

        try {
            displayVehicles();
            System.out.print("\nEnter the number of the vehicle to update (1-" + inventory.size() + "): ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index >= 0 && index < inventory.size()) {
                System.out.println("\n=== Update Vehicle ===");
                System.out.print("Enter new make: ");
                String make = scanner.nextLine();
                System.out.print("Enter new model: ");
                String model = scanner.nextLine();
                System.out.print("Enter new color: ");
                String color = scanner.nextLine();
                System.out.print("Enter new year: ");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter new mileage: ");
                int mileage = Integer.parseInt(scanner.nextLine());

                String result = inventory.get(index).updateVehicle(make, model, color, year, mileage);
                System.out.println("\n" + result);
            } else {
                System.out.println("\nInvalid vehicle number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nError: Please enter a valid number.");
        }
    }

    private static void removeVehicle() {
        if (inventory.isEmpty()) {
            System.out.println("\nNo vehicles in inventory.");
            return;
        }

        try {
            displayVehicles();
            System.out.print("\nEnter the number of the vehicle to remove (1-" + inventory.size() + "): ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;

            if (index >= 0 && index < inventory.size()) {
                inventory.remove(index);
                System.out.println("\nVehicle successfully removed from inventory");
            } else {
                System.out.println("\nInvalid vehicle number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("\nError: Please enter a valid number.");
        }
    }

    private static void displayVehicles() {
        if (inventory.isEmpty()) {
            System.out.println("\nNo vehicles in inventory.");
            return;
        }

        System.out.println("\n=== Current Inventory ===");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("\nVehicle #" + (i + 1));
            String[] info = inventory.get(i).listVehicleInfo();
            for (String detail : info) {
                System.out.println(detail);
            }
        }
    }

    private static void saveToFile() {
        if (inventory.isEmpty()) {
            System.out.println("\nNo vehicles in inventory to save.");
            return;
        }

        System.out.print("\nWould you like to save the inventory to a file? (Y/N): ");
        String response = scanner.nextLine().toUpperCase();
        
        if (response.equals("Y")) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("Autos.txt"))) {
                writer.println("=== Vehicle Inventory ===");
                for (int i = 0; i < inventory.size(); i++) {
                    writer.println("\nVehicle #" + (i + 1));
                    String[] info = inventory.get(i).listVehicleInfo();
                    for (String detail : info) {
                        writer.println(detail);
                    }
                }
                System.out.println("Information has been saved to Autos.txt");
            } catch (Exception e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("File will not be saved");
        }
    }
}