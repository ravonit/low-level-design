package com.pattern.openclose;

public class Square extends Shape{
    private int size;

    @Override
    public void draw(){
        System.out.println("Drawing square");
    }

}
