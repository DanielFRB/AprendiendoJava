package com.dfrb.lambdas;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber miNum;
        miNum = () -> 123.25;
        System.out.println("Un valor fijo: " + miNum.getValue());

        miNum = () -> Math.random() * 100;
        System.out.println("Un numero aleatorio: " + miNum.getValue());
        System.out.println("Otro numero aleatorio: " + miNum.getValue());
    }
}
