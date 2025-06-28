package com.ecommerce.model.orderitem;

public class Orderitem{
    private Product product;
    private int quantity;
    private double lineTotal;

    public Orderitem(Product product, int quantity){
        this.product=product;
        this.quantity=quantity
    }

    @Override
    public String toString() {
        return "Orderitem{" +
                "product=" + product +
                ", quantity=" + quantity +
                ", lineTotal=" + lineTotal +
                '}';
    }


}