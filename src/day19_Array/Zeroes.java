package day19_Array;


import java.util.Arrays;

public class Zeroes {
    public static void main(String[] args) {

        int [] arr = {10, 0, 5, 0, 1 , 0 };
        int[] arr2 = new int[arr.length];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] !=0){
                arr2[j]= arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(arr2));



    }
}
/*
 write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */