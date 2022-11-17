package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991,1,25));

        System.out.println(person);

        person.breath();

        System.out.println("----------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 100000);

        System.out.println(employee);

        employee.breath();

        System.out.println("______________________________");

        Student student = new Student("Alexandru",'M',LocalDate.of(2016,04,15),"A32","Java developer","A","Harvard");

        System.out.println(student);
        student.breath();
        student.study();
        student.drink();

        System.out.println("________________________________________");

        Student student1  =new Student("Igariok",'M',LocalDate.of(1983,10,27),"A35","Softer Engineer","A","Cambridge");

        System.out.println(student1);
    }
}
