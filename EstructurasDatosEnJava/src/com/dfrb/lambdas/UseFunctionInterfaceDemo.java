package com.dfrb.lambdas;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = (n) -> {
            int res = 1;
            for(int i = 1; i <= n; i++) {
                res = i * res;
            }
            return res;
        };
        System.out.println("The factorial of 4 is: " + factorial.apply(4));
        System.out.println("The factorial of 7 is: " + factorial.apply(7));
    }
}
