package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int numb = 5;

        Collections.sort(list);

        ArrayList<Integer> removeDup = new ArrayList<>();
        for (Integer each : list){
            if (!removeDup.contains(each)){
                removeDup.add(each);
            }
        }
        int ntgMax = removeDup.get(removeDup.size()-numb);

        System.out.println(removeDup);
        System.out.println(ntgMax);


        System.out.println("___________________second method__________________________________________");

        ArrayList<Integer> largest = new ArrayList<>();
        largest.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n=5;
        int largestN=0;
        Collections.sort(largest);
        ArrayList<Integer> nonDup = new ArrayList<>();
        for (Integer each : largest) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }
        largest = nonDup;
        largestN=nonDup.get(nonDup.size()-n);

        System.out.println(largestN);

    }
}
/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */