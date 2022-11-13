package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoString {

    public static void main(String[] args) {

       String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.addAll(Arrays.asList(arr1));
        arr3.addAll(Arrays.asList(arr2));
        System.out.println(arr3);


    }
}
 /*   write a program that can combine two String arrays into one arrayList
	            ex:
                        arr1 = {"A", "B", "C"};
                        arr2 = {"D", "E", "F", "G"};

                        output:
                        list ==> {"A", "B", "C", "D", "E", "F", "G"}
*/