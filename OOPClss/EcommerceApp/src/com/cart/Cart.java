package com.cart;
import com.cartItem.CartItem;
import com.customer.Customer;

import java.util.ArrayList;


public class Cart {
    private Customer customer;
    private ArrayList<CartItem>items = new ArrayList<>();

    public Cart(Customer customer){
        this.customer=customer;
    }


    public void addItem(CartItem item){
        if(item != null){
            items.add(item);
        }
    }


    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", items=" + items +
                '}';
    }

}
