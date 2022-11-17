package day11_string;

import java.util.*;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ", "");
        // trim(0 & replace() methods will make sure that the white spaces
        // & additional spaces between the characters will be removed

        System.out.println("Enter your last name:");
        String last = input.nextLine().trim().replace(" ", "");

        input.close();



        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        //getting first character of first name  +  the remaining characters of the first name

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;

        System.out.println(full_name);



     /* First method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String name = scan.nextLine();
        System.out.println("Enter your last name");
        String name1 = scan.nextLine();
        scan.close();

        char firstName = name.toUpperCase().charAt(0);
        char lastName = name1.toUpperCase().charAt(0);
        String result = (firstName + name.toLowerCase().substring(1) + " " +
                "" + (lastName + name1
                .toLowerCase().substring(1)));
        System.out.println(result);
*/

    }
}

/* Second method
 firstName = firstName.toLowerCase();
        firstName = firstName.replaceFirst("c", "C");
        lastName = lastName.toLowerCase();
        lastName = lastName.replaceFirst("s", "S");

        System.out.println(firstName + " " + lastName);

 */



/*
7. Write a program that asks user to enter first and last names,
 and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */