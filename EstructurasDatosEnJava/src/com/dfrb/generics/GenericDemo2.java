package com.dfrb.generics;

// A simple generic class with two type
// parameters: T and V.
class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void showTypes() {
        System.out.println("Tipo de T es: "+ ob1.getClass().getName());
        System.out.println("Tipo de V es: "+ ob2.getClass().getName());
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(Integer.valueOf(88), "Genericos");
        tgObj.showTypes();

        int v = tgObj.getOb1().intValue();
        System.out.println("Valor: "+ v);

        String str = tgObj.getOb2();
        System.out.println("Valor: "+ str);
    }
}
