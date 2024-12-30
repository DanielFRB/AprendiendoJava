package com.dfrb.lambdas;

// Demonstrate a Constructor reference.
class MyClassB {
    private int val;

    MyClassB(int v) {
        this.val = v;
    }

    int getVal() {
        return val;
    }
}

interface MyFuncB {
    MyClassB func(int n);
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFuncB myClassCons = MyClassB::new;
        MyClassB mc = myClassCons.func(100);

        System.out.println("val in mc is: " + mc.getVal());
    }
}
