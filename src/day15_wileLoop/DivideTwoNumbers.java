package day15_wileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();
        int sum =0;
        for (int i = 0; i <numb1 ; i+=numb2) {
            sum+=1;
        }
        System.out.print(sum);

    }
}
             // varianta2

/*
 int countDiv = 0;
        System.out.println("Enter first number");
        int n1 = input.nextInt();

        System.out.println("Enter second number");
        int n2 = input.nextInt();

        while(n1 >= n2){
            n1 -= n2;
            countDiv++;
        }

        System.out.println(countDiv);
*/







/*
 Create a class named DivideTwoNumbers and Write a program that can divide
  two positive numbers without using / (division) and * (multiplication) operators.

 */