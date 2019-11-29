package com.telran;


import com.telran.shape.Line;
import com.telran.shape.Picture;
import com.telran.shape.Rectangle;
import com.telran.shape.Shape;

public class Application {

    public static void main(String[] args) {

        Shape line = new Line('*', 20);
        Shape rect = new Rectangle('#',4, 15);
        Shape pict = new Picture('-', new Shape[]{line, rect});

//        line.draw();
//        rect.draw();
        pict.draw();
    }
}