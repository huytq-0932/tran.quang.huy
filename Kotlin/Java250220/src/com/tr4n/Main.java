package com.tr4n;

import com.tr4n.laptop.Laptop;
import com.tr4n.laptop.Run;
import com.tr4n.shape.Circle;
import com.tr4n.shape.Shape;
import com.tr4n.shape.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int aa = 1;

    public static void main(String[] args) {
//        int a = 3;
//        float b = 3f;
//        double c = 5;
//        int[] array = new int[]{1, 5, 3, 2};
//        // short , boolean, long , char,
//        String d = "124";
//        String e = "456";
//        System.out.println("Number = " + a + "\n");
//
//        // ------------
//
//        Laptop laptop = new Laptop("Black", "Dell vostro", 16);
//       // laptop.bootstrap();
//        laptop.color = "Red";
//        laptop.setRam(4);
//      //  laptop.bootstrap();
//        System.out.println(laptop.getRam());
//        //laptop.shutdown();
//        //----
//        LaptopDell dell = new LaptopDell("Black", "Dell vostro", 16);
//        dell.init();
//        System.out.println(dell.getInfo());
        //--------------
//        print(Laptop.quantity);
//        laptop.bootstrap();
//        print(Laptop.quantity);

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop = new Laptop();
        Laptop.addNewOne();
        System.out.println(aa);

        Laptop laptop3 = new Dell("234", "12", 32);
        Run lap = new Laptop();
        lap.bootstrap();

        List<Integer> array = new ArrayList<>();
        Integer a = null;
        Character c;

//        Shape shape = new Shape("Shape1");
//        System.out.println(shape.getName() + " : " + shape.getErea());

        Shape circle = new Circle("Circle1", 2f);
        System.out.println(circle.getName() + " : " + circle.getArea());

        Shape square = new Square("Square1", 2f);
        System.out.println(square.getName() + " : " + square.getArea());

        float abb = (float) Utils.add(0d, 3);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);

        for (Shape shape : shapes) {
            System.out.println(shape.getName());
        }

        for (Shape shape : shapes) {

        }

        shapes.forEach(shape -> {
            System.out.println(shape.getName());
        });
    }

    private static void print(int value) {
        System.out.print(value);
    }
}