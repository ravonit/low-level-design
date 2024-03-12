package com.pattern.liskov;

public class LiskovTest {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setLength(9);
        Square square = new Square();
        square.setSize(6);
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

    }
}
