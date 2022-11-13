package Replit;

import java.util.Scanner;

public class ApptLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = scan.nextInt();

        //WRITE YOUR CODE HERE:
        String text = ("Sorry, we do not offer that many bedrooms");
        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 3) {
            switch (numberOfBedrooms) {
                case 1:
                    System.out.println("One Bedroom Selected");
                    System.out.println("Starting Price: 1100");
                    break;
                case 2:
                    System.out.println("Two Bedroom Selected");
                    System.out.println("Starting Price: 1850");
                    break;
                default:
                    System.out.println("Three Bedroom Selected");
                    System.out.println("Starting Price: 2550");
            }
        }
        System.out.println(text);
    }
}
/*
Use if statements to find the cost of leasing an apartment based on the number of bedrooms. Use the numberOfBedrooms variable and these rates to get the final price:
1 bedroom: 1100
2 bedroom: 1850
3 bedroom: 2550
Note: If an invalid bedroom number is given no price is displayed
Note: Can use multiple if statements or a multi branch if statement
Main topics: if statements, primitive variables, concatenation, operators
 */