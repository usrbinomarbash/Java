package com.glovo.model;
import java.time.LocalDate;

//for getter setter select the field right click===> refactor==>encapsulate fields==>select fields

public class Courrier{
    private String name;
    private String phoneNumber;
    private String vehicleType;
    private boolean availability;
    private LocalDate deliveryTime;

    public Courrier(String name, String phoneNumber, String vehicleType, boolean availability, LocalDate deliveryTime){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.vehicleType=vehicleType;
        this.availability=availability;
        this.setDeliveryTime(deliveryTime);
    }

    public Courrier(String name, String phoneNumber, String vehicleType)
    {
        this(name,phoneNumber,vehicleType,true,LocalDate.now());
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public LocalDate getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDate deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }

    public boolean isAvailable(){
        return availability;
    }

    public void setAvailability(boolean availability)
    {
        this.availability=availability;
    }



    @Override
    public String toString(){
        return String.format("The courrier assigned to this order is:%s and his phone number is: %s and is driving a %s and he/she is currently(not/is) %s available: and will be delivering the order at %s", name, phoneNumber, vehicleType, availability, deliveryTime);
    }


}