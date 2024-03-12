package com.pattern.dependency.inversion;

public class Driver implements DeliveryService{

    @Override
    public void deliverProduct(Product p){
        System.out.println("Product delivered is " + p.getProductName());
    }
}
