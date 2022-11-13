package day25_constructor;

import java.time.LocalDate;

public class TestEmployedObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Igariok", 39,'M',"Java Developer", 12000, LocalDate.of(2023,02,10));

        Employee e2 = new Employee("Alexandru", 31, 'M', "Project Manager", 120000, LocalDate.of(2021, 5, 1));


        System.out.println(e1);

        System.out.println(e2);


    }
}
