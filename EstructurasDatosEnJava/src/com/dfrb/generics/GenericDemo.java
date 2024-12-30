package com.dfrb.generics;

// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen<T> {
    T ob;
  
    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Tipo de T es: "+ ob.getClass().getName());
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Valor: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<> ("Prueba Genericos");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Valor: "+ str);
    }
}
