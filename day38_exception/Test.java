package day38_exception;

import utilities.Library;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello World");
        Library.sleep(3.5);
        System.out.println("Hoe are yoy today?");

        System.out.println("____________________________________");

        if (LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();
        }
        throw new RuntimeException("Something went wrong");
    }
}
