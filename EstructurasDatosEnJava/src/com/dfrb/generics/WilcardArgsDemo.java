package com.dfrb.generics;

// Determine if two averages are the same.
// Notice the use of the wildcard.
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

    boolean isSameAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}

public class WilcardArgsDemo {
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

        System.out.print("Promedio de iob y dob ");
        if(iob.isSameAvg(dob)) {
            System.out.println("es el mismos.");
        } else {
            System.out.println("es diferente.");
        }

        System.out.print("Promedio de iob y fob ");
        if(iob.isSameAvg(fob)) {
            System.out.println("es el mismos.");
        } else {
            System.out.println("diferente.");
        }
    }
}
