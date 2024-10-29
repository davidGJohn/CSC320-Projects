package com.inventory;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }


    public Automobile(String make, String model, String color, int year, int mileage) {

        try {
            if (year < 1990 || year > 2025) {
                throw new IllegalArgumentException("Invalid Year");
            }
            if (mileage < 0) {
                throw new IllegalArgumentException("Invalid Mileage");
            }
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;  
        
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error in constructor: " + e.getMessage());
        }

        
    }

    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            if (year < 1900 || year > 2025) {
                throw new IllegalArgumentException("Invalid year");
            }
            if (mileage < 0) {
                throw new IllegalArgumentException("Invalid mileage");
            }
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle successfully added";
        } catch (IllegalArgumentException e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    public String[] listVehicleInfo() {
        try {
            String[] info = new String[5];
            info[0] = "Make: " + this.make;
            info[1] = "Model: " + this.model;
            info[2] = "Color: " + this.color;
            info[3] = "Year: " + this.year;
            info[4] = "Mileage: " + this.mileage;
            return info;
        } catch (Exception e) {
            return new String[]{"Error retrieving vehicle information: " + e.getMessage()};
        }
    }

    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle successfully removed";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            if (year < 1900 || year > 2025) {
                throw new IllegalArgumentException("Invalid year");
            }
            if (mileage < 0) {
                throw new IllegalArgumentException("Invalid mileage");
            }
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle successfully updated";
        } catch (IllegalArgumentException e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}
