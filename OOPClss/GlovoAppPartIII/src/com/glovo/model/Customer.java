package com.glovo.model;
import com.glovo.manageable.Manageable;

public class Customer extends User implements Manageable{

    private String address;
    private String paymentInfo;


    public Customer(String name, String phoneNumber, String email, String password, String address,String paymentInfo) {
        super(name,phoneNumber,email,password);
        this.address = address;
        this.paymentInfo=paymentInfo;
    }

    @Override
    public void manageOrder(){
        System.out.println("Customer " + getName() + " viewing orders");
    }

    @Override
    public void manageProfile(){
        System.out.println("Customer " + getName() + " viewing Profile");
    }



    public String getAddress() {
        return address;
    }


    public String getPaymentInfo() {
        return paymentInfo;
    }
    @Override
    public String toString() {
        return(super.toString()  + " and its address: "+this.address+" and his payment info is: "+this.paymentInfo);
    }
}