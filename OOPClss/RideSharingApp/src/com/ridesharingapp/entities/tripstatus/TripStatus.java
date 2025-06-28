package com.ridesharingapp.entities.tripstatus;

public enum TripStatus {
    REQUESTED("Trip requested by driver"),
    ASSIGNED("Trip assigned to driver"),
    IN_PROGRESS("Trip in progress"),
    COMPLETED("Trip completed");

    public final String description;

    TripStatus(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }
}
