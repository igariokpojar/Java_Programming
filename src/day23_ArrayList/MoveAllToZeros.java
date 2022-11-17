package day23_ArrayList;

import java.util.*;
public class MoveAllToZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> zero = new ArrayList<>();

        for (Integer each : list) {
            if (each == 0) {
                zero.add(each);
            }
        }
        list.removeAll(zero);
        list.addAll(zero);

        System.out.println(list);

        System.out.println("__________second method___________________");


        ArrayList<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int countZeros = Collections.frequency(list, 0);

        l.removeAll(Arrays.asList(0));

        for (int i = 0; i < countZeros; i++) {
            l.add(0);
        }

        System.out.println(l);

    }
}
/*
Write a program that can move all the zeros to the last indexes of Array-zero
            ex:
                zero: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */