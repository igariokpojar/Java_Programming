package practice;

import javax.swing.text.Utilities;
import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {
        String str = "I Love Alla And Alexandru Alla Alla";
        /*
        String word = "Java";
         str = str.toLowerCase();
         word = word.toLowerCase();
         */

         int count = 0 ;

        while (str.contains("Alla")){ // repeat only if contains Alla
            str =str.replaceFirst("Alla","");
            count++;
        }
        System.out.println(count);



    }
}
/*
A string is said to be palindrome after converting all uppercase letters into lowercase letters and removing all spaces  it reads the same backward as forward.
For e.g. civic, radar, level, rotor, race car, are palindrome because if we try to read it from backward, it is same as forward.
Write a method that accepts a String as argument and return true
 if it is a palindrome, or false otherwise.
Assume string has only alphanumeric characters include letters
and numbers and spaces, ignore upper-lowercase characters.
 */