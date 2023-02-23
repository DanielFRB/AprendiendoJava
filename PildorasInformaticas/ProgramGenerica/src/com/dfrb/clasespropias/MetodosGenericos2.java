package com.dfrb.clasespropias;

import java.util.*;

/**
 * @author dfrb@ne
 */

public class MetodosGenericos2 {
    public static void main(String[] args) {
        String[] nombres = {"Jose", "Maria", "Pedro", "Daniel", "Gabriel"};
        System.out.println(MisMatrices2.getMenor(nombres));
        GregorianCalendar[] fechas = {new GregorianCalendar(2020, 11, 15),
                                                                    new GregorianCalendar(2018, 5, 12),
                                                                    new GregorianCalendar(2018, 8, 25),
                                                                    new GregorianCalendar(2020, 5, 25),
                                                                    new GregorianCalendar(2019, 12, 25)};
        System.out.println(MisMatrices2.getMenor(fechas));
    }
}

class MisMatrices2 {
    public static <T extends Comparable> T getMenor(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T elementoMenor = a[0];
        for (int i = 1; i < a.length; i++) {
            if (elementoMenor.compareTo(a[i]) > 0) {
                elementoMenor = a[i];
            }
        }
        return elementoMenor;
    }
}
