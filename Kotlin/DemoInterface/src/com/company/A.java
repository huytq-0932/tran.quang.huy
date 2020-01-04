package com.company;

public interface A {
    void println();
    default void print() {
        System.out.println("A");
    }
}
