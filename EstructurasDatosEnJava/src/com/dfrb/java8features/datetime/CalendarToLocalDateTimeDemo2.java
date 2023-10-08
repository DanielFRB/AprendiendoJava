package com.dfrb.java8features.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author dfrb@ne
 */

public class CalendarToLocalDateTimeDemo2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        LocalDateTime singleLineLocalDateTime = getLocalDateTime(calendar);
        LocalDate singleLineLocalDate = getLocalDate(calendar);
        System.out.println("Conversion de Calendar a LocalDateTime: "+ singleLineLocalDateTime);
        System.out.println("Conversion de Calendar a LocalDate: "+ singleLineLocalDate);
    }
    
    private static LocalDateTime getLocalDateTime(Calendar calendar) {
        return LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
    }
    
    private static LocalDate getLocalDate(Calendar calendar) {
        return LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId()).toLocalDate();
    }
}
