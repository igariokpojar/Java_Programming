package day16_nestedloop;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("enter your score");
            double score = input.nextDouble();

            if (!(score >= 0 && score <= 100)) {
                System.err.println("invalid entry");
                System.exit(1);
            }

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("would you like to continue? yes/no");
            String answer = input.next().toLowerCase();

            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid entry");
                System.exit(1);
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                return;
            }
        }

    }
}
/*
Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program

 */