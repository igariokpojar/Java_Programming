package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birdDay = LocalDate.of(1983,10,27);
        System.out.println("birdDay = " + birdDay);

        System.out.println("_________________get method______________________________________________" );

        System.out.println(today.getYear());

        System.out.println("___________________________________________________________________________");

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(birdDay.getDayOfWeek());


        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("_____________________________________________________________________");

        today = today.plusYears(1);

        System.out.println(today);

        System.out.println("______________________________________________________________________");

        LocalDate graduationDate = LocalDate.of(2025,6,4);
          graduationDate = graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);

        graduationDate.plusDays(100);
        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);


        System.out.println("______________________________________________________________________");

        LocalDate yourBirthDay = LocalDate.of(1983,10,27);
       LocalDate yourBrotherBirthDay =  yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthDay);


        System.out.println("______________________________________________________________________");

        LocalDate birthday1 = LocalDate.of(1983,10,27);
        LocalDate birthday2 = LocalDate.of(1991,4,11);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1);

        System.out.println("______________________________________________________________________");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(  grad_date.isBefore(  LocalDate.of(2022, 12, 31) ));
        System.out.println(  grad_date.isAfter(  LocalDate.of(2022, 12, 31) ));

        System.out.println("----------------------------------------------");

        System.out.println(  LocalDate.of(2022, 6, 16).isLeapYear()  );


    }
}
