package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.addAll(list);
        System.out.println(list);


    }
}
/*
 Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */