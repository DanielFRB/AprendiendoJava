package com.dfrb.lambdas;

interface TestNumerico {
    boolean test(int n);
}

public class LamddaDemo2 {
    public static void main(String[] args) {
        TestNumerico isEven = (n) -> (n % 2) == 0;
        if(isEven.test(10)) System.out.println("10 is Even");
        if(!isEven.test(7)) System.out.println("7 is not Even");

        TestNumerico isNonNeg = (n) -> n >= 0;
        if(!isNonNeg.test(-4)) System.out.println("-4 es negativo");
        if(isNonNeg.test(8)) System.out.println("8 no es negativo");
    }
}
