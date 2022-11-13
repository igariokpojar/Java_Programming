package day19_Array;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] num = new int[5];

        int[] nums = {10 ,20 ,30 ,40 , 50}; // Array Literal

        System.out.println(num.length);
        System.out.println(nums.length);

        System.out.println(" num = " + Arrays.toString(num));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("______________________________________________________");

         // element:        1         2          3             4          5         6             7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Saturday"};
        // index:           0         1           2             3              4             5              6

        int n = 1;
        System.out.println(days[n-1]);

        System.out.println("____________________________________________________");

        String[] month = {"Jan", "Feb","March","April","May","jun","Jul","August","September", "October","Nov","Dec"};

        System.out.println("Arrays.toString(month) = " + Arrays.toString(month));

        for (int i = month.length-1; i >=0 ; i--) {
            System.out.println(month[i]);

        }

        System.out.println("_______________________________________________________________________");

        int[] numb2 = new int[100];


    }
}
