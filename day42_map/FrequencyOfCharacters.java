package day42_map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "bbcccaaaaa";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            map. put(each, frequency);
        }

        System.out.println(map);


    }
}
/*
1. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}
 */