package com.dfrb.java8features.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author dfrb@ne
 */

public class CalculateNumOfDaysDemo {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2020, 11, 29);
        LocalDate fecha2 = LocalDate.of(2020,12, 25);
        
        long diferencia = ChronoUnit.DAYS.between(fecha1, fecha2);
        System.out.println("Numero de dias de diferencia entre ambas fechas: "+ diferencia);
    }
}
