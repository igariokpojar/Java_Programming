package Replit;

import java.util.Scanner;

public class PacientInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!" +
                "\nPlease enter your personal information" +
                "\nEnter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        String fullName = lastName+", "+firstName;
        String email="";
        String street ="";


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        String address = street+", "+city+", "+state+" "+zipCode;
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        System.out.println("Patient personal information\nFull name: "+lastName+", "+firstName +
                "\nAddress: "+street+ ", "+city+", "+state+" "+zipCode+
                "\nContacts: work phone number - "+ workPhoneNumber+", personal phone number - "
                +personalPhoneNumber+", email: "+email+"\nAge: "+age+ "\nHeight: "+height+"" +
                "\nWeight: "+weight+" pounds\nMarried?: "+isMarried);

        scan.close();
    }
}
/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city,
 address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight.
 Declare boolean variable: isMarried (for marriage status). Declare 2 long variables:
  workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.
 */