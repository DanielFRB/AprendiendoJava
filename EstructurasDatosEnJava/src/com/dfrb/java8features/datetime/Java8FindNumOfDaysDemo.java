package com.dfrb.java8features.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author dfrb@ne
 */

public class Java8FindNumOfDaysDemo {
    public static void main(String[] args) {
        LocalDate fechaLocal1 = LocalDate.of(2021, Month.JULY, 25);
        LocalDate fechaLocal2 = LocalDate.of(2021, Month.AUGUST, 18);
        
        // 1ra Forma: Usando el metodo between() de la Clase ChronoUnit
        long diferenciaDeDias = ChronoUnit.DAYS.between(fechaLocal1, fechaLocal2);
        System.out.println("La diferencia de dias usando el metodo between() es: "+ diferenciaDeDias);
        
        // 2da Forma: Usando el metodo until()
        diferenciaDeDias = fechaLocal1.until(fechaLocal2, ChronoUnit.DAYS);
        System.out.println("Numero de dias de diferencia usando el metodo until() es: "+ diferenciaDeDias);
        System.out.println("------------");
        
        // Usando fechas en formato String
        System.out.println("Fechas en formato String yyyy-MM-dd");
        String fechaStr1 = "2021-05-15";
        String fechaStr2 = "2021-08-19";
        
        LocalDate fechaLocal3 = LocalDate.parse(fechaStr1);
        LocalDate fechaLocal4 = LocalDate.parse(fechaStr2);
        
        diferenciaDeDias = ChronoUnit.DAYS.between(fechaLocal3, fechaLocal4);
        System.out.println("La diferencia de dias usando el metodo between() es: "+ diferenciaDeDias);
        
        diferenciaDeDias = fechaLocal3.until(fechaLocal4, ChronoUnit.DAYS);
        System.out.println("Numero de dias de diferencia usando el metodo until() es: "+ diferenciaDeDias);
    }
}
