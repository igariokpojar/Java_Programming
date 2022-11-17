package day20_forEach;

public class Unique {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 5, 6, 6, 8, 10};

        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j) {
                    count++;//two matches of 2
                }
            }
            if (count == 1) {//2!=1, so "2" is  not uniques goes on until finds what elem.
                // count==1 and then prints
                System.out.print(i + " ");

            }

        }
    }
}


/*
Write a program that can display the unique elements of an array

			MUST use for each loops
 */