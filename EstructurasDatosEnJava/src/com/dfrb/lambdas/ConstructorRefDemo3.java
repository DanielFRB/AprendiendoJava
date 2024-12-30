package com.dfrb.lambdas;

interface MyFuncG2<R, T> {
    R func(T n);
}

class MyClassG2<T> {
    private T val;

    MyClassG2(T v) {
        this.val = v;
    }

    MyClassG2() {
        this.val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass3 {
    String str;

    MyClass3(String s) {
        this.str = s;
    }

    MyClass3() {
        this.str = null;
    }

    String getVal() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    static <R,T> R myClassFactory(MyFuncG2<R,T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncG2<MyClassG2<Double>, Double> myClassCons = MyClassG2<Double>::new;
        MyClassG2<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("val in mc is: " + mc.getVal());

        MyFuncG2<MyClass3, String> myClassCons2 = MyClass3::new;
        MyClass3 mc3 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("str in mc3 is: " + mc3.getVal());
    }
}
