package com.company;

public interface B {
    void println();
    default void print() {
        System.out.println("B");
    }
}
