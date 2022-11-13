package day15_wileLoop;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        String name = input.nextLine();

        System.out.println("Please enter your gender:");
        String gender = input.next().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.out.println("Invalid Entry\nPlease enter your gender:");
            gender = input.next().toLowerCase();
        }

        System.out.println("Please enter your Marital Status: (yes/no)");
        String married = input.next().toLowerCase();

        while (!(married.equals("yes") || married.equals("no"))) {
            System.out.println("Invalid Entry \nPlease enter your Marital Status: (yes/no)");
            married = input.next().toLowerCase();
        }
        System.out.println("Please enter your age:");
        int age = input.nextInt();

        while (!(age > 0 && age < 120)) {
            System.out.println("Invalid input\nPlease enter your age:");
            age = input.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = input.nextInt();

        while (!(miles >= 5)) {
            System.out.println("Invalid entry\nHow many miles do you drive in a day?");
            miles = input.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance?");
        input.nextLine();
        String coverage = input.nextLine().toLowerCase();

        System.out.println("Have you had any accidents or claims in the past 5 years? (yes/no)");
        String claims = input.next();

        while (!(claims.equals("yes") || claims.equals("no"))) {
            System.out.println("Invalid input\nHave you had any accidents or claims in the past 5 years? (yes/no)");
            claims = input.next();
        }

        double cost = 0;

        if (coverage.contains("liability") && (age < 25)) {
            cost += 90;
            if (miles <= 10) {
                cost += 10;
            } else if (miles > 10 && miles <= 50) {
                cost += 30;
            } else {
                cost += 50;
            }
        } else if (coverage.contains("liability") && age >= 25) {
            cost += 50;
            if (miles <= 10) {
                cost += 10;
            } else if (miles > 10 && miles <= 50) {
                cost += 30;
            } else {
                cost += 50;
            }
        } else if (coverage.contains("full") && age >= 25) {
            cost += 120;
            if (miles <= 10) {
                cost += 20;
            } else if (miles > 10 && miles <= 50) {
                cost += 40;
            } else {
                cost += 70;
            }
        } else if (coverage.contains("full") && age < 25) {
            cost += 160;
            if (miles <= 10) {
                cost += 20;
            } else if (miles > 10 && miles <= 50) {
                cost += 40;
            } else {
                cost += 70;
            }
        }

        if (claims.equals("yes")) {
            cost *= 1.15;
        }
        if (claims.equals("no")) {
            cost *= .9;
        }
        if (married.equals("yes")) {
            cost *= .95;
        }

        System.out.println("Does your car have an anti-theft device?");
        String theft = input.next().toLowerCase();

        if (theft.equals("yes")) {
            cost *= .95;
        }
        System.out.println("The total cost of your insurance is : " + cost);


    }
}
/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */