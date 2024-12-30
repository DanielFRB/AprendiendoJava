package com.dfrb.lambdas;

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int res = 1;
            for(int i = 1; i <= n; i++) {
                res = i * res;
            }
            return res;
        };
        System.out.println("El factorial de 4 es: " + factorial.func(4));
        System.out.println("El factorial de 7 es: " + factorial.func(7));
    }
}
