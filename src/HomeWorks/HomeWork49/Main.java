package HomeWorks.HomeWork49;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        //1
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        //2
        LocalDate birthdayDate = LocalDate.of(1987, 9, 7);
        System.out.println(birthdayDate);

        //3 
        // не поняла условие задания, но что то все же напишу
        LocalDate date1 = LocalDate.of(2023, 10, 10);
        LocalDate date2 = LocalDate.of(2024, 3, 2);
        System.out.println(date1.compareTo(date2));



        //4
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        //5
        System.out.println(timeNow.plusHours(3));

        //6
        System.out.println(dateNow.minusWeeks(1));

        //7
        LocalDate tomorrow = dateNow.minusDays(1);
        LocalDate yesterday = dateNow.plusDays(1);

        System.out.println(dateNow.isBefore(tomorrow));
        System.out.println(dateNow.isBefore(yesterday));

        System.out.println(dateNow.isAfter(tomorrow));
        System.out.println(dateNow.isAfter(yesterday));
        
    }
    
}
