package day15_wileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;

        while (num>=0){
            sum+=num;
            num=input.nextInt();
            if (num<0);
        }
        System.out.println(sum);
        input.close();





    }
}
/*
5. Create a class named UntilNegative and Write a program that
calculates the sum of numbers entered by the user until user enters a negative number.
 */