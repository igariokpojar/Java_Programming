package day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {

        String[] myGroup  = new String[5]; // the size of array is always fixed.
        myGroup[0] = "Alexandru";
        myGroup[myGroup.length-1] = "Alla"; // or index [4]
        myGroup[2] = "Igor";
        myGroup[3] = "Ion";
        myGroup[1] = "Anna";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Adelina"; // reassign Anna with Adelina

        System.out.println(Arrays.toString(myGroup));

        System.out.println("_____________ Revers Group______________________________________________________");

        for (int i = myGroup.length-1; i >=0 ; i--) { // print in revers order

            System.out.println(myGroup[i]);
        }

        System.out.println("____________________Short Cut ______________________________________________________");

        for (int i = 0; i < myGroup.length; i++) {

        }
        


    }
}
