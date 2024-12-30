package com.dfrb.lambdas;

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String res = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                res += str.charAt(i);
            }
            return res;
        };
        System.out.println("Lambda reverso es: " + reverse.func("Lambda"));
        System.out.println("Expression reverso es: " + reverse.func("Expression"));
    }
}
