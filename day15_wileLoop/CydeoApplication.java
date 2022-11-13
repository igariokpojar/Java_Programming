package day15_wileLoop;

import java.util.Scanner;

public class CydeoApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "Cydeo";
        String password = "Cydeo123";
        System.out.println("Enter username");
        String givenUsername = input.next();

        System.out.println("Enter password");
        String givenPassword = input.next();


        if (!(username.equals(givenUsername) && password.equals(givenPassword))) {

            for (int i = 0; i < 3; i++) {
                System.err.println("Invalid entry! Try again");
                System.out.println("Enter your username again");
                givenUsername = input.next();

                System.out.println("Enter your password again");
                givenPassword = input.next();

            }
        }

        if (username.equals(givenUsername) && password.equals(givenPassword)) {
            System.out.println("logged in");
        } else {
            System.err.println("your account is locked");
        }

        input.close();
    }
}
/*
 you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."


 */