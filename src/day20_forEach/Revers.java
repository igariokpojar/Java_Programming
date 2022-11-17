package day20_forEach;

import java.util.Arrays;

public class Revers {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

    }
}


/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};
	        output:
	            reversedArray = {5,4,3,2,1};
 */




