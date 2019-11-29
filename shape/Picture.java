package com.telran.shape;

import java.util.Arrays;

public class Picture extends Shape {

    private Shape[] shapes;

    public Picture(char symbol, Shape[] shapes) {
        super(symbol);
        this.shapes = shapes;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    @Override
    public void draw() {
        for (int i = 0; i < 100; i++) {
            System.out.print(getSymbol());
            }
        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            //System.out.println(Arrays.toString(shapes));
            //System.out.println(getShapes());
            //System.out.println(shapes[i]);
            //System.out.println(Arrays.toString(getShapes()));
            shapes[i].draw();
        }
        System.out.println();
    }
}

