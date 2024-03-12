package com.pattern.interfaceserg;

public class InterfaceSegMain {
    public static void main(String[] args){
        Harrier harrier = new Harrier();
        harrier.usesGasoline();
        NexonEv nev = new NexonEv();
        nev.supportsCharge();
        nev.usesBattery();
    }
}
