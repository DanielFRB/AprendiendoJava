package com.dfrb.java8features.datetime;

import java.util.Date;

/**
 * @author dfrb@ne
 */

public class CalculateNumOfDaysDemo {
    public static void main(String[] args) {
        Date fecha1 = new Date(2020, 11, 29);
        Date fecha2 = new Date(2020,12, 25);
        
        long fecha1EnMs = fecha1.getTime();
        long fecha2EnMs = fecha2.getTime();
        long diferencia = 0;
        
        if (fecha1EnMs > fecha2EnMs) {
            diferencia = fecha1EnMs - fecha2EnMs;
        } else {
            diferencia = fecha2EnMs - fecha1EnMs;
        }
        
        // Convertir la diferencia de milisegundos a dias
        int dias = (int) (diferencia / (1000 * 60 * 60 * 24));
        System.out.println("Numero de dias de diferencia entre ambas fechas: "+ dias);
    }
}
