package com.dfrb.lambdas;

class MyClassGen<T> {
    private T value;

    MyClassGen() {
        this.value = null;
    }

    MyClassGen(T v) {
        this.value = v;
    }

    T getVal() {
        return value;
    }
}

interface MyFuncGen<T> {
    MyClassGen<T> func(T n);
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFuncGen<Integer> myClassCons = MyClassGen<Integer>::new;
        MyClassGen<Integer> mc = myClassCons.func(100);

        System.out.println("value in mc is: " + mc.getVal());
    }
}
