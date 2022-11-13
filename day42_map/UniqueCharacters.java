package day42_map;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aabcccdeeeef";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            if(frequency == 1)
                map. put(each.charAt(0), frequency);

        }

        System.out.println(map);

    }
}
/*
 Write a program that can find the unique characters from a String
	              Not: MUST use map
	            Ex:
	                    str = "aabcccdeeeef";

	            output:
	                    {b=1, d=1, f=1}

 */