package day15_wileLoop;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = input.next();

        String result = "";

        for (int i = 0; i <= word.length()- 1; i++) {

            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
        input.close();


    }
}
/*
 Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are same, then it's unique

 */