package com.dfrb.lambdas;

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Array Empty");
    }
}

interface DoubleNumericarrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] vals = { 1.2, 2.1, 3.2, 4.1, 5.6, 6.4, 7.2, 8.1, 9.0 };
        DoubleNumericarrayFunc average = (n) -> {
            double sum = 0;
            if(n.length == 0) {
                throw new EmptyArrayException();
            }
            for(int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("The average is: " + average.func(vals));
        System.out.println("The average is: " + average.func(new double[0]));
    }
}
