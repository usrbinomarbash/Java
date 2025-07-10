package com.glovo.app;

import com.glovo.manageable.Manageable;
import com.glovo.model.Customer;
import com.glovo.model.RestaurantOwner;
import com.glovo.model.DeliveryPerson;
import com.glovo.model.Admin;
import com.glovo.model.Permissions;
import com.glovo.model.User;

import java.util.List;




import java.util.*;
import java.time.LocalDate;


public class GlovoApp {
    public static void main(String [] args){
        List<Manageable> actors = List.of(
                new Customer("Younes", "0623558955", "yo.d@ex@gmail.com", "pw", "Rabat", "Visa ****3952"),
            new RestaurantOwner("Johnson", "0654225236", "a@rest.com", "pw","Marrakech",4.5,List.of("Pizza","Salad")),
            new DeliveryPerson("Bobby", "0622258548", "bobby212@gmail.com", "pw","Scooter",LocalDate.now()),
            new Admin("Victoria", "0625588556", "c@customer.com", "pw",1,List.of(Permissions.MANAGE_USERS, Permissions.VIEW_REPORTS))
        );

        for(Manageable manag : actors){
            User k = (User)manag;
            k.login(k.getEmail(), k.getPassword());
            manag.manageOrder();
            manag.manageProfile();
            k.logout(k.getEmail(),k.getPassword());


        }


    }
}