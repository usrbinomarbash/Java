package com.ecommerce.model.address;
package com.ecommerce.model.customer;


public class Customer{
    int id;
    String name;
    String email;
    Address billingAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Customer(int id, String name, String email, Address billingAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.billingAddress = billingAddress;
    }


}