package com.company;

public class Square extends GeometricFigure {

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}