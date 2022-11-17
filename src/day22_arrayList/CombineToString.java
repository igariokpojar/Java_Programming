package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineToString {

    public static void main(String[] args) {
       String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};

       ArrayList<String> list = new ArrayList<>();

       for (int i = 0, j=0; i < arr1.length + arr2.length; i++) {

            if (i<arr1.length){
                list.add(arr1[i]);

            }else {
                list.add(arr2[j]);
                j++;
            }
        }
        System.out.println(list);



    }
}
/*
write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */