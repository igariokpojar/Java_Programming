package day38_exception;

import java.lang.reflect.Array;

public class FifthElement {

    public static void main(String[] args) {

        String[] array = new String[3];

        try {
            System.out.println(array[4]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(array[array.length - 1] + ": object in the last index " + (array.length - 1));
            e.printStackTrace();
        }

        System.out.println("_____________second method______________________________");

        String[] arr = new String[4];

        try {
            System.out.println(Array.get(arr,4));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }



    }
}
/*
. Write a program that can return the fifth element from an array

        note: avoid getting any exceptions
 */