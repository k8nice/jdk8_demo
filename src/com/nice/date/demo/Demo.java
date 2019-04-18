package com.nice.date.demo;

import java.time.*;

public class Demo {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
/*      System.out.println(clock.instant());
        System.out.println(clock.millis());*/
        final LocalDate date = LocalDate.now();
        final LocalDate dateFormClock = LocalDate.now(clock);
//      System.out.println(date);
//      System.out.println(dateFormClock);
        final LocalTime time = LocalTime.now();
        final LocalTime timeFormClock = LocalTime.now(clock);
//      System.out.println(time);
//      System.out.println(timeFormClock);
        final LocalDateTime dateTime = LocalDateTime.now();
        final LocalDateTime datetimeFormClock = LocalDateTime.now(clock);
//      System.out.println(dateTime);
//      System.out.println(datetimeFormClock);
        final ZonedDateTime zonedDateTime = ZonedDateTime.now();
        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now(clock);
        final ZonedDateTime zonedDateTimeFormZone = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
//      System.out.println(zonedDateTime);
//      System.out.println(zonedDatetimeFromClock);
//      System.out.println(zonedDateTimeFormZone);
        final LocalDateTime from = LocalDateTime.of(2014,Month.APRIL,16,0,0,0);
        final LocalDateTime to = LocalDateTime.of(2015,Month.APRIL,16,23,58,59);
        final Duration duration = Duration.between(from,to);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours" + duration.toHours());
    }
}
