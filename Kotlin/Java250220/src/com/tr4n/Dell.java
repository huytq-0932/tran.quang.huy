package com.tr4n;

import com.tr4n.laptop.Laptop;

public class Dell extends Laptop {

    private int baoHanh;

    public Dell(String color, String type, int ram, int baoHanh) {
        super(color, type, ram);
        this.baoHanh = baoHanh;
        quantity++; 
    }

    public Dell(String color, String type, int ram) {
        super(color, type, ram);
    }

    public void init(){
        type = "HP";
        System.out.println(type);
    }
}
