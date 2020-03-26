package com.tr4n.shape;

public abstract class Shape implements Graphic {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract float getArea();

    @Override
    public void draw() {

    }
}
