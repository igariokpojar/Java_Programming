package day24_dateAndTime;

import day23_ArrayList.CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        list.removeIf( p -> p== Collections.max(list));
        list.removeIf( p->p==Collections.min(list));

        System.out.println("Second max is " + Collections.max(list));
        System.out.println("Second min is " + Collections.min(list));
    }
}
/*
 Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1
 */