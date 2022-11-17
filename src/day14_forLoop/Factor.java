package day14_forLoop;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int sum = scan.nextInt();

        int fact = 1;
        for (int i = sum; i >=1 ; i--) {
            fact *= i;
        }
        System.out.println("fact = " + fact);
        
    }
}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */