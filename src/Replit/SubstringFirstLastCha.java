package Replit;

import java.util.Scanner;

public class SubstringFirstLastCha {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        int lenght = word.length()-1;
        System.out.println("without first letter: " + word.substring(01));
        System.out.println("without last letter: " + word.substring(0, word.length() - 1));

    }
}
