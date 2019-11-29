package com.telran.shape;

public abstract class Shape {

    char symbol;
    public abstract void draw();

    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
