package practice;

import utilities.ArrasUtility;

import java.util.Arrays;


public class Practice {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        for (int each : numbers) {
            System.out.println(each);

        }
        System.out.println("______________________________________");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int each : arr) {
            if (each % 2 != 0) {


                System.out.print(each);
            }
        }
    }
}


