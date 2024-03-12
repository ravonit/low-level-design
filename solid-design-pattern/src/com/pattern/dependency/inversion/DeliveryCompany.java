package com.pattern.dependency.inversion;

public class DeliveryCompany {
    public static void main(String args[]){
        Product p1 = new Product();
        p1.setProductName("S1");
        p1.setProductPrice(23);
        Driver driver = new Driver();
        driver.deliverProduct(p1);
    }
}
