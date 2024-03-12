package com.pattern.liskov;

public class Square implements Shape {
    private int size;
    public void setSize(int size){
        this.size = size;
    }

    @Override
    public int getArea() {
        return this.size*this.size;
    }
}
