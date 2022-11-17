package Replit;

import java.util.Scanner;

public class FirstLastCharacter {
    public static void main(String[] args) {

                //DO NOT CHANGE
                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                //WRITE YOUR CODE HERE
                char w = word.charAt(0);
                int la = word.length() - 1;
                char l = word.charAt(la);
                System.out.println(w + "" + l);

            }
}
/*
Use String methods to find the first and last character of the given word.
The value of the word will be input from a Scanner, but you only need to interact with the
String variable.
 Output in the following format:
 */