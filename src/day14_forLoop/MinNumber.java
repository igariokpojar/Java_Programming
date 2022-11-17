package day14_forLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int min = input.nextInt();

        for (int i = 1; i < 5; i++) {

            System.out.println("enter a number");
            int num = input.nextInt();

            if (num < min) {
                min = num;
            }
        }
        System.out.println("min number is: " + min);
    }
}
