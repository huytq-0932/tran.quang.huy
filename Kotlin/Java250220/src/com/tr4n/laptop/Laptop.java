package com.tr4n.laptop;

import com.tr4n.Main;

public class Laptop  implements Run , Unique{
    // mau sac
    public String color;
    // hang
    protected String type ;
    // ram
    private int ram;

    public static int quantity = 0;

    public Laptop() {
        quantity++;
        System.out.println("Tao moi laptop thu "+ quantity);
    }

    public Laptop(String color, String type, int ram) {
        this.color = color;
        this.type = type;
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    // tat may
    void shutdown() {
        System.out.println("Shutdown ...");
    }

    public String getInfo() {
        return type + " " + color + " " + ram ;
    }

    public void setRam(int ram) {
        int d = 3;
        if (ram > 16) {
            System.out.println("Max 16gb");
        } else {
            this.ram = ram;
        }
    }

    public void addRam(int ram) {
        this.ram += ram;
    }

    public static void addNewOne(){
        System.out.println(quantity);
    }


    @Override
    public void bootstrap() {

    }
}
