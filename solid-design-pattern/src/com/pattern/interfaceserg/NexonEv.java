package com.pattern.interfaceserg;

public class NexonEv implements ElectricCar, Recharge {
    @Override
    public void usesBattery(){
        System.out.println("Mileage is 400 km for full charged battery");
    }

    @Override
    public void supportsCharge(){
        System.out.println("Supports regenerative braking");
    }
}
