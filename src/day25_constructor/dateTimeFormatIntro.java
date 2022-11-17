package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormatIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern(" MMM/dd/y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));

        System.out.println("__________________________________");

        System.out.println();




        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y hh:mm a");

        LocalDateTime time1 = LocalDateTime.now();

        System.out.println(time1.format(dtf));

        System.out.println("______________________________________________");

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/y");

        LocalDateTime time2 = LocalDateTime.of(2020,11,24,13,00);

        System.out.println(time2.format(dtf1));
    }
}
