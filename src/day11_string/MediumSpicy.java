package day11_string;

import java.util.Scanner;

public class MediumSpicy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first word please");
        String first = input.next();
        System.out.println("Enter a second word");
        String second = input.next();
        System.out.println(first.substring(1,first.length()));
        System.out.println(second.substring(1,second.length()));
        }



    }

/*
Medium Spicy:
	5. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */