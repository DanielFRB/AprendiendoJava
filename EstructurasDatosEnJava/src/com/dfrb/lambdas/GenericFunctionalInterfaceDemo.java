package com.dfrb.lambdas;

interface SomeFunction<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunction<String> reverse = (str) -> {
            String res = "";
            for(int i = str.length() -1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        System.out.println("Lambda reverso es: " + reverse.func("Lambda"));
        System.out.println("Expression reverso es: " + reverse.func("Expression"));

        SomeFunction<Integer> factorial = (n) -> {
            int res = 1;
            for(int i = 1; i <= n; i++) {
                res = i * res;
            }
            return res;
        };
        System.out.println("El factorial de 3 es: " + factorial.func(3));
        System.out.println("El factorial de 5 es: " + factorial.func(5));
    }
}
