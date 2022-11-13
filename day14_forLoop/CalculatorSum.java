package day14_forLoop;

import java.util.Scanner;

public class CalculatorSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int sum = scan.nextInt();

        int result = 0;
        for (int i = 1; i <=sum ; i++) {
            result+=i;
        }
        System.out.println("result = " + result);
    }
}
/*
rite a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */