package day22_arrayList;

import utilities.ArrasUtility;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

        boolean has25 = ArrasUtility.contains(numbers, 25);

        System.out.println("has25 = " + has25);

        System.out.println("--------------------------------------------");

        String[] students = {"Alexandru", "Alla", "Anna",};

        System.out.println( ArrasUtility.contains(students, "Igariok")  );


    }
}
