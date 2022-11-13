package Replit;

import java.util.Scanner;

public class ReversSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW:
        if(word.length() < 5){
            System.out.println("Too short!");}
        if (word.length() >5){
            System.out.println("Too long!");
        }
        for(int i=word.length()-1;i>=0;i--)
        {
            System.out.print(word.charAt(i));

        }
    }
}
/*
 Use String methods and if statements to reverse a String that is five characters long.
 If the given word is not five characters long, it will not be reversed.
 Use the following to output a value:
1. If the word is less than 5 characters: print Too short!
2. If the word is more than 5 characters: print Too long!
3. If the word is 5 characters: print the reversed version of the String.
   Reading characters from the end to the beginning.
 */