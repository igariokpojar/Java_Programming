package Replit2;

import java.util.Scanner;

public class PositiveNegativeOrZero {

    public static void sign(int n) {
        //WRITE YOUR CODE BELOW
        if (n > 0)
            System.out.println("positive");
        else if (n < 0)
            System.out.println("negative");
        else
            System.out.println("zero");


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sign(n);


    }
}
/*
Finish the given method sign() to print if the number is a positive number, negative number, or zero.
 The sign() method is already called in the main method and is also given an argument n.
The value of n is coming from a Scanner input, but should be treated as just a number.
 */