package com.company;

public class C implements A, B {

    @Override
    public void println() {

    }

    @Override
    public void print() {
        // Bắt buộc phải override nếu không sẽ báo lỗi
    }
}
