package day19_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int[] scores = new int[5]; // index: 0~4

        scores[2] =78;// access the index number and assign different data like index=2 and assign to 78;
        scores[0] = 85;
        scores[1] = 58;
        scores[3] = 27;
        scores[4] = 15;

       // scores = new int[10]; // now the int[5] is eligible for garbage collection bc we reassign new value of [5] witch is [10];

       // scores = new int[50]; // now we reassign the int [10] to [50] and the variable 10 is eligible to garbage;

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("_______________________________________________________________________________________");

        for (int i = 0; i <5 ; i++) { // i : index numbers of scores array

            System.out.println(scores[i]);

            System.out.println("___________________________________________________________________________________");

            System.out.println(scores[scores.length-1]);

        }

    }
}
