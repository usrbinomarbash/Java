package com.glovo.model;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;


    public Customer(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNumber;
    }

    public void setPhoneNum(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer Name: %s, Phone Number: %s, Address: %s",
                name, phoneNumber, address
        );

    }
}