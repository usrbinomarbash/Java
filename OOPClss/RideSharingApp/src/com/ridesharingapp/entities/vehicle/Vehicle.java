package com.ridesharingapp.entities.vehicle;

public class Vehicle {
    private String model;
    private String licensePlate;
    private String color;

    public Vehicle(String model, String licensePlate, String color)
    {
        this.model=model;
        this.licensePlate=licensePlate;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate=licensePlate;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }


}
