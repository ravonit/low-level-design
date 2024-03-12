package com.pattern.interfaceserg;

public class Harrier implements ICECar{
    //Harrier doesn't need to implement Recharge
    @Override
    public void usesGasoline(){
        System.out.println("Mileage is 10 kmpl");
    }
}
