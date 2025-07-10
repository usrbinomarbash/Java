package com.ridesharingapp.main;


import com.ridesharingapp.entities.rider.Rider;
import com.ridesharingapp.entities.driver.Driver;
import com.ridesharingapp.entities.vehicle.Vehicle;
import com.ridesharingapp.entities.trip.Trip;
import com.ridesharingapp.entities.tripstatus.TripStatus;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Menu {
    private Trip currentTrip;
    private Scanner scanner;

    public Menu(Trip initialTrip) {
        this.currentTrip = null;
    }

    public void run() {
        while (true) {
            System.out.println("\nRideSharingApp Menu:");
            System.out.println("1. Create a new trip");
            System.out.println("2. Assign a driver and vehicle to a trip");
            System.out.println("3. Update trip status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter trip ID: ");
                int tripId;
                try {
                    tripId = scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid trip ID. Please enter a number.");
                    scanner.nextLine();
                    continue;
                }
                System.out.print("Enter rider name: ");
                String riderName = scanner.nextLine();
                System.out.print("Enter rider location: ");
                String riderLocation = scanner.nextLine();
                System.out.print("Enter rider email: ");
                String riderEmail = scanner.nextLine();

                Rider newRider = new Rider(riderName, riderLocation, riderEmail);
                currentTrip = new Trip(tripId, newRider, null, null, LocalDateTime.now(), TripStatus.REQUESTED);
                System.out.println("New trip created: " + currentTrip.toString());

            } else if (choice == 2) {
                System.out.print("Enter driver name: ");
                String driverName = scanner.nextLine();
                System.out.print("Enter driver phone: ");
                String driverPhone = scanner.nextLine();
                System.out.print("Is driver available (true/false): ");
                boolean isAvailable;
                try {
                    isAvailable = scanner.nextBoolean();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter true or false.");
                    scanner.nextLine();
                    continue;
                }
                System.out.print("Enter vehicle model: ");
                String vehicleModel = scanner.nextLine();
                System.out.print("Enter vehicle license plate: ");
                String licensePlate = scanner.nextLine();
                System.out.print("Enter vehicle color: ");
                String vehicleColor = scanner.nextLine();

                Driver newDriver = new Driver(driverName, driverPhone, isAvailable);
                Vehicle newVehicle = new Vehicle(vehicleModel, licensePlate, vehicleColor);
                currentTrip.setDriver(newDriver);
                currentTrip.setVehicle(newVehicle);
                currentTrip.setStatus(TripStatus.ASSIGNED);
                System.out.println("Driver and vehicle assigned to trip: " + currentTrip.toString());

            } else if (choice == 3) {
                System.out.println("Available statuses: REQUESTED, ASSIGNED, IN_PROGRESS, COMPLETED");
                System.out.print("Enter new status for the current trip: ");
                String statusInput = scanner.nextLine().toUpperCase();
                try {
                    TripStatus newStatus = TripStatus.valueOf(statusInput);
                    currentTrip.setStatus(newStatus);
                    System.out.println("Updated trip: " + currentTrip.toString());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid status entered. Please use REQUESTED, ASSIGNED, IN_PROGRESS, or COMPLETED.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting RideSharingApp.");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}