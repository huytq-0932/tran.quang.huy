package com.tr4n.shape;

public class Circle extends Shape {

    private static final float PI = 3.14f;

    private float radius;

    public Circle(String name, float radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return radius * radius * PI;
    }
}
