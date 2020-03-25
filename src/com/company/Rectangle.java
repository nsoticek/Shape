package com.company;

public class Rectangle extends GeometricFigure {

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
