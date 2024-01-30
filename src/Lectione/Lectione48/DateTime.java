package Lectione.Lectione48;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTime {
    // Date/Time API

    //1. Localdate
    //2.LocalTime
    //3.LocaldateTime
    //4.ZonedDateTime
    //5.Period
    //6.Duration
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(); // текущее время
        System.out.println("Time is : " + localTime);

        LocalTime localTime1 = LocalTime.of(15,30,35);
        System.out.println("Time is : " + localTime1);
        System.out.println("hour : " + localTime1.getHour());
        System.out.println("minutes : " + localTime1.getMinute());

        LocalTime ourLocalTime = LocalTime.of(19, 40, 20);
        System.out.println("add hours " + ourLocalTime.plusHours(2));
        System.out.println("add minutes " + ourLocalTime.plusMinutes(10));
        System.out.println("add seconds " + ourLocalTime.plusSeconds(20));


        //isBefore/ isAfter(true/false)

        LocalTime checkLocalTime = LocalTime.of(13,15 );
        System.out.println(checkLocalTime.isBefore(LocalTime.now()));
        System.out.println(checkLocalTime.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        //LocalDate - без указания временной зоны
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate localDate = LocalDate.of(2022, 1, 30);
        System.out.println(localDate);

        System.out.println("Is 2024 a leap year? " + now.isLeapYear()); //проверяет высокосный год
        System.out.println("Is 2023 a leap year? " + localDate.isLeapYear());

        LocalDate yesterday = now.minusDays(1);
        System.out.println("yesterday was " + yesterday);

        System.out.println(now.getDayOfWeek());
        System.out.println(now.getEra());
        System.out.println(now.lengthOfMonth());

        //LocalDateTime - сочетание даты и времени
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 1, 29, 12, 46);
        System.out.println(localDateTime1);

        //ZoneDateTime - с учетом временной зоны
        Set<String> availableZoneId = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneId);

        LocalDateTime nowDateTime = LocalDateTime.now();
        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime inLondon = ZonedDateTime.now(london);
        System.out.println("Time London is : " + inLondon);

        ZoneId tokio = ZoneId.of("Asia/Tokyo");
        ZonedDateTime inTokio = ZonedDateTime.now(tokio);
        System.out.println("Time Tokio is : " + inTokio);

        //Period клас используемый для изменения даты или получения разницы между датами
        LocalDate nowDate = LocalDate.now();
        LocalDate newdate = nowDate.plus(Period.ofDays(5));
        System.out.println(newdate);

        int five = Period.between(nowDate, newdate).getDays();
        System.out.println(five);

        ChronoUnit.DAYS.between(nowDate, newdate);

        //Duration для работы со временем
        LocalTime time1 = LocalTime.of(9, 40, 0);
        LocalTime newTime = time1.plus(Duration.ofHours(4));
        long duration = Duration.between(time1, newTime).getSeconds();
        System.out.println(duration);
        ChronoUnit.SECONDS.between(time1, newTime);

        //форматирование даты и времени
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = dateTimeFormatter.format(dateTime);
        System.out.println("Formated with basig ISO " + formatted);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formatted1 = dateTimeFormatter1.format(dateTime);
        System.out.println("Formated with basig ISO local time is " + formatted1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm:ss");
        dateTime = LocalDateTime.now();
        String res = dateTimeFormatter2.format(dateTime);
        System.out.println("Formated with pattern " + res);

        //M - месяц в виде числа
        //МММ - сокращенным словом  Jan
        //ММММ  - полное название 

        //Е - день  недели
}
}