package day19_Array;

import java.util.Arrays;

public class ReversArray {

    public static void main(String[] args) {
         int [] arr ={1,2,3,4,5,};
         int[] reversArr = new int[arr.length];

        for (int i = reversArr.length - 1; i >= 0; i--) {
            reversArr[i] = arr[arr.length-i-1];

        }
        System.out.println(Arrays.toString(reversArr));
    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */