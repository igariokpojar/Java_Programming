package day15_wileLoop;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 0;
        String divisible3 = "";
        String divisible5 = "";
        String divisible15 = "";
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0) ;
            if (i % 3 == 0) {
                divisible3 = i + " ";
            } else if (i % 5 == 0) {
               divisible5 += i + " ";
            } else if (i % 15 == 0)
                divisible15 += i + " ";
        }
        System.out.print("Divisible by 3: " + divisible3 +
                "\nDivisible by 5: " + divisible5 +
                "\nDivisible by 15: " +divisible15);

    }
}
