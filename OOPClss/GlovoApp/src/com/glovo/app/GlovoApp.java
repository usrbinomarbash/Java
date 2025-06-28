package com.glovo.app;
import com.glovo.model.Courrier;
import com.glovo.model.Customer;
import com.glovo.model.Order;
import com.glovo.model.OrderStatus;
import com.glovo.model.Restaurant;



import java.util.*;

public class GlovoApp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Name");
        String custName = sc.nextLine();

        System.out.println("Customer Phone Number");
        String custPhone = sc.nextLine();

        System.out.println("Customer Address");
        String custAddress = sc.nextLine();
        Customer customer = new Customer(custName,custPhone,custAddress);

        System.out.println("Restaurant Name");
        String restName = sc.nextLine();

        System.out.println("Restaurant Address");
        String restAddress = sc.nextLine();

        System.out.println("Restaurant Rating");
        double rating = Double.parseDouble(sc.nextLine());

        Restaurant restaurant = new Restaurant(restName,restAddress,rating);

        Courrier cour1 = new Courrier("Mustapha", "061752525", "Van");




    }
}