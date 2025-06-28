package com.ridesharingapp.entities.trip;

import com.ridesharingapp.entities.driver.Driver;
import com.ridesharingapp.entities.rider.Rider;
import com.ridesharingapp.entities.vehicle.Vehicle;
import com.ridesharingapp.entities.tripstatus.TripStatus;
import java.time.LocalDateTime;

public class Trip {
    private int tripId;
    private Rider rider;
    private Driver driver;
    private Vehicle vehicle;
    private LocalDateTime startTime;
    private TripStatus status;

    public Trip(int tripId, Rider rider, Driver driver, Vehicle vehicle, LocalDateTime startTime, TripStatus status) {
        this.tripId = tripId;
        this.rider = rider;
        this.driver = driver;
        this.vehicle = vehicle;
        this.startTime = startTime;
        this.status = status;
    }

    // Unassigned trip
    public Trip(int tripId, Rider rider, LocalDateTime startTime, TripStatus status) {
        this.tripId = tripId;
        this.rider = rider;
        this.driver = null;
        this.vehicle = null;
        this.startTime = startTime;
        this.status = status;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Trip{tripId=" + tripId +
                ", rider=" + (rider != null ? rider.getName() : "None") +
                ", driver=" + (driver != null ? driver.getName() : "None") +
                ", vehicle=" + (vehicle != null ? vehicle.getModel() : "None") +
                ", startTime=" + startTime +
                ", status=" + status + "}";
    }
}