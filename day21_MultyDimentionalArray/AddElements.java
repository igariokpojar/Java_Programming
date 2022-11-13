package day21_MultyDimentionalArray;

import utilities.ArrasUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;

        System.out.println(Arrays.toString(new_array));

        System.out.println("------------------------------------------");

        int[] numbers = { 100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(numbers));

        numbers = ArrasUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));


        System.out.println("------------------------------------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArrasUtility.addElement(nums, 5.5);

        nums = ArrasUtility.addElement(nums, 6.5);

        nums = ArrasUtility.addElement(nums, 7.5);

        System.out.println(Arrays.toString(nums));


        System.out.println("------------------------------------------");

        String[] students = {"Yasin", "Sumeye", "Ermek"};

        students = ArrasUtility.addElement(students, "Umran");

        students = ArrasUtility.addElement(students, "Abidullah");

        students = ArrasUtility.addElement(students, "Muhtar");

        System.out.println(Arrays.toString(students));




    }
}
