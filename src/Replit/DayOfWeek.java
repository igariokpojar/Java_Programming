package Replit;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE BELOW

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Not a valid day");}
    }
}
/*
Use a switch statement to display the day of the week when given an int day.
If an invalid day is given print Not a valid day.
The starting day will be 1, as Monday and the ending day will be 7, as Sunday.
Main topics: switch statements, primitive variables
 */