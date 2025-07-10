package com.customer;
import com.address.Address;

public class Customer {
    private int id;
    private String name;
    private String email;
    private Address billingAddress;


    public Customer(int id, String name, String email, Address billingAddress){
        this.id=id;
        this.name=name;
        this.email=email;
        this.billingAddress=billingAddress;
    }

    public Address getBillingAddress(){
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress){
        this.billingAddress=billingAddress;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
