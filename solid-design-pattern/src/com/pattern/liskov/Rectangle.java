package com.pattern.liskov;

public class Rectangle implements Shape {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public int getArea(){
        return this.length*this.width;
    }
}
