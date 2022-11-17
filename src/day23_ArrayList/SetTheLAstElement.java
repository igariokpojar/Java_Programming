package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetTheLAstElement {

    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.set(4,0);
        System.out.println(list);

        System.out.println("_________second method__________________________________");

        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        l.set(l.size()-1,0);
        System.out.println(l);




    }
}
/*
 write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
 */