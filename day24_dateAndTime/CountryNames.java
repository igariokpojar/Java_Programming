package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> countryName = new ArrayList<>(Arrays.asList("Moldova", "Romania","Ucraine","Poland", "Montenegro", "New Zealand"));

        countryName.removeIf(p->p.length()>=10);
        System.out.println(countryName);


    }
}
/*
Create an ArrayList of string called country names,
 write a program that can remove all the country names that have length of 10 or greater
 */