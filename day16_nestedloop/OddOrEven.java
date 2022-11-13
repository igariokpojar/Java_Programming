package day16_nestedloop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {

            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) { // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }
        }
    }
}
/*
  String result = "";
        String result1 = "";

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                result1 = result1 + j + " ";
            }
        }
        System.out.println(result.trim() + "\n" + result1.trim());
 */