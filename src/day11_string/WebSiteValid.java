package day11_string;

import java.util.Scanner;

public class WebSiteValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = "www.igariokpojar@.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);
        boolean valid = url.endsWith("com.");
        boolean Valid = url.endsWith(".edu");
        boolean valid1 = url.endsWith(".gov");
        System.out.println(valid);
        System.out.println(Valid);
        System.out.println(valid1);


        System.out.println("___________________________________________");
        System.out.println("Enter a word");
        String word = input.next();


        String word1 = "xcodeX";
        if (word1.startsWith("x"))
            word1 = word1.replaceFirst("x", "a");
        System.out.println(word1);
        if (word1.endsWith("X"))
            word1 = word.replace("X", "a");
        System.out.println(word1);


        System.out.println("_____________________________________________");
        System.out.println("Please enter a word");
        String word2 = input.next();
        if (word2.endsWith("ly")) {
            System.out.println("really??");
        } else {
            System.out.println("Never mind");
        }
        input.close();
    }
}



















/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex
 */
/*
1. write a program that can check if the given website is
valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov
 */
/*
ask the user to enter a word.
if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */