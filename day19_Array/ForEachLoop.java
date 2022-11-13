package day19_Array;

import java.util.Arrays;
public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        for (int each:numbers){
        System.out.println(each);}


        System.out.println("________________for each loop2____________________________________________");

        String[]  fruits = {"Orange", "Banana", "Apple", "Strawberry", "Lemon", "Grape"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("_________________Multi dimensional array___________________________________");

        int[]  arr1 = {10,20,30};
        int[]  arr2 = {40,50};
        int[]  arr3 = {60,70,80,90};

        /*
        int[][] arr2D = new int[3][];
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
       */

        int[][]arr2D = {{10,20,30},{40,50},{60,70,80,90}};
         //                 0          1         2
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[2]));

        //80
        System.out.println(arr2D[2][2]);


        System.out.println("_____________________________________________________________________________");

        String[][] groups = {{"Igor","Alla"},{"Alexandru","Adelina","Bogdan"},{"Linda","Catalina","Vit","Daniel"}};

        System.out.println(Arrays.toString(groups[1]));// toString method is for one print only.... remember that...
        System.out.println((groups[2][0])); // prints only one name
        System.out.println(Arrays.deepToString(groups));// prints all names



    }
}
