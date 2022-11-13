package day19_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // create variable named numbers that can have 5 integers.
        int[] number = new int[5];// [0, 0, 0, 0, 0, 0] ==> index: 0~4

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        System.out.println(Arrays.toString(number));
        System.out.println(number.length);

        System.out.println("_____________________________________________________________________");

        // CREATE A VARIABLE NAMED COLORS THAT HAS: yellow, red, white, blue, green, black

        String[] colors = {"Yellow","Red", "White","Blue","Green","Black"};


        System.out.println(Arrays.toString(colors));
        System.out.println(colors.length);


        System.out.println("___________ArrayMethods_______//toString Method______________________________-");

        String[] names  = {"John", "Smith","Shay","Breanna","Josh"};

        System.out.println(Arrays.toString(names));

        System.out.println("_______________________________//Sort Method_________________________________");

        int[] numbers = {5,1,3,2,0};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println("____________________Equal Method_______________________________________________");

        char[] arr1 = {'a','b','c'};
        char[] arr2 = {'a','b','c'};

        System.out.println(Arrays.equals(arr1,arr2));

        System.out.println("_____________________copyOf method_____________________________________________");

        int[] scores = {45, 55, 65, 75, 85};
         int[] scores2 = Arrays.copyOf(scores,3);

        System.out.println(Arrays.toString(scores2));

        System.out.println("______________________copyOf Range_____________________________________________");

        char[] elements = {'A','B','C','D','E','F'};
        // INDEX            0   1   2   3   4   5

        char[] someElements = Arrays.copyOfRange(elements,1,4+1);// 4+1 is if we need to count the next element for example 5 element

        System.out.println(Arrays.toString(someElements));


        System.out.println("_________________Iterating the Array_____________________________________________");

        int[] numbers1 = {10, 20, 30, 40, 50, 60, 40, 80};
        // indexes:         0  1  2  3  4

        for (int i = 0; i <=numbers1.length-1 ; i++) {
            System.out.println(numbers1[i]);
        }


        System.out.println("___________________revers the numbers_________________________________________________________");

        for (int i= numbers1.length-1 ; i>=0; i--) {
            System.out.println(numbers1[i]);
        }

        System.out.println("_______________loop Shortcut____________________________________________________________________");

        String[]  fruits = {"orange","Banana","apple","Strawberry","Lemon", "Grape"};
        // indexes:           0         1        2         3          4        5

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("______________________________________________________________-");

        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);

        }




    }
}
