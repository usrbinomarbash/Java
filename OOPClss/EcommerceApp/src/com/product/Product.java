package com.product;

public class Product {
    private String sku;
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String sku, String name, double price, int quantityInStock){
        this.sku=sku;
        this.name=name;
        this.price=price;
        this.quantityInStock=quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }


}
