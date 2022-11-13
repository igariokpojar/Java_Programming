package day9_Scanner;

import java.util.Scanner;

public class Homereplit {

    public static class Main {
        public static void main(String[] args) {
            //DO NOT TOUCH BELOW
            String firstName = "James";
            String lastName = "May";
            String fullName = " May, James";
            String email = "jamesmay@gmail.com";
            String street = "Jones Branch Dr";
            String state = "VA";
            String city = "McLean";
            String address = "7925 Jones Branch Dr";

            long contacts = 7896542314l;
            int age = 35;
            String zipcode = "22102";
            double height = 5.10;
            double weight = 173.2 ;
            boolean isMarried = true;
            long work_Phone_Number = 7896542314l;
            long personal_Number = 2406542314l;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the patient portal!");
            System.out.println("Please enter your personal information");
            System.out.println("Enter your first name");
            firstName = scan.nextLine();
            System.out.println("Enter your last name");
            lastName = scan.nextLine();


            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            email = scan.next();
            scan.nextLine();//to capture Enter key press
            System.out.println("Enter your street");
            street = scan.nextLine();
            // continue for city
            street = scan.nextLine();
            System.out.println("Enter your city");
            city = scan.next();
            System.out.println("Enter your state");
            state = scan.next();
            scan.nextLine();
            System.out.println("Enter your zip code");
            zipcode = scan.nextLine();
            System.out.println("Enter your work phone number");
            work_Phone_Number  = scan.nextLong();
            System.out.println("Enter your personal phone number");
            personal_Number = scan.nextLong();
            System.out.println("Enter your age");
            age = scan.nextInt();
            System.out.println("Enter your height");
            height = scan.nextDouble();
            System.out.println("Enter your weight");
            weight = scan.nextDouble();
            System.out.println("Are you married?");
            isMarried = scan.nextBoolean();

            System.out.println("Patient personal information" +
                    "\n"+ "Full name" +":"+fullName + "\n" +"Address: " +
                    address + "," + city + "," + " " + state + zipcode
                    + "\n"+ "Contacts:" + " work phone number " +
                    work_Phone_Number+ ","  + " personal phone number " +
                    "-"+ " " +personal_Number + ","+ " "  +"email:"+" "
                    + email+ "\n" + "Age:" +" "+ age +
                    "\n" + "Height: " +height + "\n" + "Weight: " +
                    ""+weight + " pounds" + "\n" + "Married?:" +" " + "true");


           /* System.out.println("firstName = " + firstName);
            System.out.println("lastName = " + lastName);
            System.out.println("fullName = " + fullName);
            System.out.println("email = " + email);
            System.out.println("street = " + street);
            System.out.println("state = " + state);
            System.out.println("city = " + city);
            System.out.println("address = " + address);
            System.out.println("contacts = " + contacts);
            System.out.println("age = " + age);
            System.out.println("zipcode = " + zip_code);
            System.out.println("height = " + height);
            System.out.println("weight = " + weight);
            System.out.println("isMarried = " + isMarried);
            System.out.println("workPhoneNumber = " + work_Phone_Number);
            System.out.println("personalNumber = " + personal_Number);*/

           /* System.out.println("Enter command:");
            char response = scan.next().charAt(0);
            //WRITE YOUR CODE BELOW
            String result = "" ;
            switch (response) {
                case 'y':
                    result = "Your request is being processed";
                    break;
                case 'n':
                    result = "Thank you for your consideration";
                    break;
                case 'h':
                    result = "Sorry, no live agents are currently available";
                    break;
                default:
                    result = "Invalid entry, please try again";
            }
            System.out.println("result = " + result);*/

        }
    }
}

