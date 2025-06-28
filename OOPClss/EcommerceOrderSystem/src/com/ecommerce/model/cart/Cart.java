package com.ecommerce.model.customer;
package com.ecommerce.model.cartItem;
package com.ecommerce.model.cart;


public class Cart{
    private Customer customer;
    private CartItem items[];

    public Cart(Customer customer){
        this.customer=customer;
    }

    public void addItem(CartItem item){

    }
    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", items=" + java.util.Arrays.toString(items) +
                '}';
    }


}