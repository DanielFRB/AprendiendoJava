package com.dfrb.java8features.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author dfrb@ne
 */

public class CalendarToLocalDateDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date input = cal.getTime();
        LocalDate localDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("Conversion de Calendar a LocalDate: "+ localDate);
    }
}
