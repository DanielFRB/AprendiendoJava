package com.dfrb.generics;

// Use a generic constructor.
class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        this.val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}

public class GenericConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        test.showVal();
        test2.showVal();
    }
}
