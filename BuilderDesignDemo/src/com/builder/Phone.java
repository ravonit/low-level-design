package com.builder;

public class Phone {
    private String os;
    private String processor;
    private int ram;
    private double screenSize;
    private int batterySize;

    public Phone(String os, String processor, int ram, double screenSize, int batterySize) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", batterySize=" + batterySize +
                '}';
    }
}
