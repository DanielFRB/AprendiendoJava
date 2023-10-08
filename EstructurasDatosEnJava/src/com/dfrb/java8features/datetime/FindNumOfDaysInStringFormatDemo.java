package com.dfrb.java8features.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dfrb@ne
 */

public class FindNumOfDaysInStringFormatDemo {
    public static void main(String[] args) throws ParseException {
        String DATE_FORMAT = "yyyy-MM-dd";
        SimpleDateFormat formatoFecha = new SimpleDateFormat(DATE_FORMAT);
        String fechaStr1 = "2022-05-31";
        String fechaStr2 = "2022-01-21";
        Date fecha1 = formatoFecha.parse(fechaStr1);
        Date fecha2 = formatoFecha.parse(fechaStr2);
        
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
        System.out.println("Numero de dias de diferencia usando fechas en formato String: "+ dias);
    }
}
