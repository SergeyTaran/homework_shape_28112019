package com.telran.shape;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(getSymbol());

            }
            System.out.println();
        }
    }
}
