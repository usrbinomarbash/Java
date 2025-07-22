package com.glovo.model;
import java.time.LocalDate;
import com.glovo.manageable.Manageable;

//for getter setter select the field right click===> refactor==>encapsulate fields==>select fields

public class DeliveryPerson extends User implements Manageable{
    private String vehicleType;
    private boolean availability;
    private LocalDate deliveryTime;

    public DeliveryPerson(String name, String phoneNumber, String email, String password, String vehicleType, LocalDate deliveryTime) {
        super(name, phoneNumber, email, password);
        this.vehicleType=vehicleType;
        this.deliveryTime=deliveryTime;
        this.availability=true;
    }

    public DeliveryPerson(String name, String phoneNumber, String email, String password, String vehicleType) {
      this(name, phoneNumber, email, password, vehicleType, LocalDate.now());
    }


    public void setName(String name)
    {
        super.setName(name);
    }

    public String getName()
    {
        return super.getName();
    }

    public String getPhoneNumber()
    {
        return super.getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber){
        super.setPhoneNumber(phoneNumber);
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
    public void manageOrder(){
        System.out.println("This person: "+getName()+" is delivering your order");
    }

    @Override
    public void manageProfile(){
        System.out.println("This person: "+getName()+" is updating vehicle info");
    }


    @Override
    public String toString(){
        return(super.toString()+" and its vehicle is: "+vehicleType+" and his availability: "+ availability+" and will be delivering it at: "+deliveryTime);
    }
}