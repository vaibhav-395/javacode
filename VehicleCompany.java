package src;

import java.util.Scanner;

// Abstract base class for vehicles
abstract class Vehicle {
    public abstract void move();
}

// Helicopter class
class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The helicopter flies in the air.");
    }
}

// Car class
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives on the road.");
    }
}

// Train class
class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("The train runs on the track.");
    }
}

// Main class
public class VehicleCompany {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the type of vehicle
        System.out.println("Enter the type of vehicle (helicopter, car, train):");
        String vehicleType = scanner.nextLine().toLowerCase();

        // Create the appropriate vehicle based on user input
        Vehicle vehicle;
        switch (vehicleType) {
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "car":
                vehicle = new Car();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid vehicle type.");
                return;
        }

        // Call the move method of the selected vehicle
        vehicle.move();

        // Close the scanner
        scanner.close();
    }
}
