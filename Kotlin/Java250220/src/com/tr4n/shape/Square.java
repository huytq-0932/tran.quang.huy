package com.tr4n.shape;

public class Square extends Shape {

    private float side;

    public Square(String name, float side) {
        super(name);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
