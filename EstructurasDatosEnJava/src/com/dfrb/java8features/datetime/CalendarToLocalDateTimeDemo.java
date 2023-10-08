package com.dfrb.java8features.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author dfrb@ne
 */

public class CalendarToLocalDateTimeDemo {
    public static void main(String[] args) {
        // Crear una instancia de Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar instance: "+ calendar.toString());
        
        // Obteniendo la Zona Horaria
        TimeZone tz = calendar.getTimeZone();
        // Obteniendo la ID de zona
        ZoneId zoneId = tz.toZoneId();
        
        // Realizando la Conversion
        LocalDateTime localDateTime = LocalDateTime.ofInstant(calendar.toInstant(), zoneId);
        System.out.println("Conversion a Local Date Time: "+ localDateTime);
    }
}
