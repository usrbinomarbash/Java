package com.ridesharingapp.main;

import com.ridesharingapp.entities.rider.Rider;
import com.ridesharingapp.entities.driver.Driver;
import com.ridesharingapp.entities.vehicle.Vehicle;
import com.ridesharingapp.entities.trip.Trip;
import com.ridesharingapp.entities.tripstatus.TripStatus;


import java.time.LocalDateTime;

public class RideSharingApp {
    public static void main(String[] args) {
        // Create sample objects
        Rider rider1 = new Rider("Alice Brown", "123 Elm St", "alice@example.com");
        Rider rider2 = new Rider("Bob Wilson", "456 Pine Rd", "bob@example.com", "555-1234");

        Driver driver1 = new Driver("Charlie Davis", "555-5678", true);
        Driver driver2 = new Driver("Diana Evans", "555-9012");

        Vehicle vehicle1 = new Vehicle("Toyota Camry", "XYZ-123", "Blue");
        Vehicle vehicle2 = new Vehicle("Honda Accord", "ABC-456", "Blue");

        Trip trip1 = new Trip(1, rider1, null, null, LocalDateTime.now(), TripStatus.REQUESTED);

        // Display initial object states
        System.out.println("\nInitial Object States:");
        System.out.println(rider1.toString());
        System.out.println(rider2.toString());
        System.out.println(driver1.toString());
        System.out.println(driver2.toString());
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());
        System.out.println(trip1.toString());

        // Start the menu
        Menu menu = new Menu(trip1);
        menu.run();
    }
}