package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> list = new ArrayList<>();

        list.addAll(Arrays.asList(LocalDate.now(),LocalDate.of(2000,10,10),LocalDate.of(2016,3,2)));

        list.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(list);



    }
}
/*
 create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */