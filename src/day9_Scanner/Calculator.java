package day9_Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");

        double firstNumber = input.nextDouble();

        System.out.println("enter a math operator");

        char operator = input.next().charAt(0);

        System.out.println("enter the second number");

        double secondNumber = input.nextDouble();

        double result = 0;

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            switch (operator) {

                case '+':
                    result = firstNumber + secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                default:
                    result = firstNumber / secondNumber;

            }
            System.out.println(result);

        } else {
            System.out.println("invalid entry");
        }
        input.close();

    }
}
/*
Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"

 */