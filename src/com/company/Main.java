package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 5);
        Square square = new Square(5);

        rectangle.calculateArea();
        System.out.println();
        square.calculateArea();
    }
}
