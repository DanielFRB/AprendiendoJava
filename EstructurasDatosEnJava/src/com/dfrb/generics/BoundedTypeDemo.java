package com.dfrb.generics;

// In this version of Stats, the type argument for
// T must be either Number, or a class derived from Number.
class Stats<T extends Number> {
    T[] nums;

    Stats(T[] n) {
        nums = n;
    }

    double average() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob promedio es: "+ v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob promedio es: "+ w);

        Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("fob promedio es: "+ x);
    }
}
