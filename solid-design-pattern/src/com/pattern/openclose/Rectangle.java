package com.pattern.openclose;

public class Rectangle extends Shape{
    private int width;
    private int length;

    @Override
    public void draw(){
        System.out.println("Drawing rectangle");
    }

}
