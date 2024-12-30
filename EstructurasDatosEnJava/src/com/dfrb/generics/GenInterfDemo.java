package com.dfrb.generics;

// A generic interface example.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals[0];

        for(int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    public T max() {
        T v = vals[0];

        for(int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

public class GenInterfDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        var iob = new MyClass<Integer>(inums);
        var cob = new MyClass<Character>(chs);

        System.out.println("Maximo Valor del arreglo de numeros: " + iob.max());
        System.out.println("Minimo Valor del arreglo de nnumeros: " + iob.min());
        System.out.println("Maximo Valor del arreglo de caracteres: " + cob.max());
        System.out.println("Minimo Valor del arreglo de caracteres: " + cob.min());   
    }
}
