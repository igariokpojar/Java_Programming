package day19_Array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] arr1 = new int[100];

       /*
        for (int i = 0, j=1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
     */

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;

        }


        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("__________________________________________________________________");

        int[] arr2 = new int[100];

        for (int i = 0 , j = 50; i < arr2.length; i++, j++) {
            arr2[i] = j;
        }
        System.out.println(" = " + Arrays.toString(arr2));

    }
}
