package Replit;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        int java = word.length();
        System.out.println(java);

        System.out.println("____________________________________________________");

        //  Scanner scan = new Scanner(System.in);
        // String word1 = scan.nextLine();
        // String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
        // boolean AirPods=sentence.contains(word);
        // System.out.println(AirPods);
        System.out.println("_____________________________________________________");

        if ((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))) {
            System.out.println(word.substring(1, word.length() - 1));
        } else if (word.startsWith("x") || word.startsWith("X")) {
            System.out.println(word.substring(1));
        } else if ((word.endsWith("x") || word.endsWith("X"))) {
            System.out.println(word.substring(0, word.length() - 1));
        } else {
            System.out.println(word);


        }
    }
}
/*
Use String methods to verify if the given sentence contains the given word.
 The values of sentence and word will be inputs from a Scanner,
 but you only need to interact with the String variables.
 Output a boolean value, true or false.
 */
