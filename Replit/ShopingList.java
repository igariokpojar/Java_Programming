package Replit;

import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String item1 = scan.nextLine();
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item2 and its price:");

        String item2 = scan.nextLine();
        double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item3 and its price:");

        String item3 = scan.nextLine();
        double price3 = scan.nextDouble();



        double totalPrice = price1 + price2 + price3;
        String result = "Item1: " + item1 + " Price: " + price1 + ", " + "Item2: " + item2 + " Price: " + price2 + ", " + "Item3: " + item3 + " Price: " + price3 + "\n" + "Total price: " + totalPrice;

        System.out.println(result);

        scan.close();

    }
}
/*
In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.
 */