package day14_forLoop;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int max = 0;

            for (int i = 0; i < 5; i++) {

                System.out.println("enter a number");
                int num = input.nextInt();

                if (num > max) {
                    max = num;
                }
            }
            System.out.println("max = " + max);
    }
}
