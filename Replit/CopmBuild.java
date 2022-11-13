package Replit;

import java.util.Scanner;

public class CopmBuild {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = scan.nextLine();
        System.out.println("Select CPU type:");
        String cpuType =scan.nextLine();
        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        scan.nextLine();
        System.out.println("Select storage type:");
        String storageType = scan.nextLine();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();
        scan.nextLine();
        System.out.println("Select screen resolution:");
        String screenType = scan.nextLine();
        double Price = (ramSize/4*50);
        switch (screenSize){
            case "13.3":
                Price+=200;
                break;
            case "15.0":
                Price+=300;
                break;
            case "17.3":
                Price+=400;
                break;
        }
        switch (cpuType){
            case "i3":
                Price+=150;
                break;
            case "i5":
                Price+=250;
                break;
            case "i7":
                Price+=350;
                break;
        }
        switch (storageType) {
            case "HDD":
                Price += storageSize / 500 * 50;
                break;
            case "SSD":
                Price += storageSize / 500 * 100;
                break;
        }
        switch (screenType) {
            case "FULLHD":
                Price += 100;
                break;
            case "4K":
                Price += 200;
                break;
        }

        System.out.println("Final price is: $"+Price);
    }
}
/*
Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:
First ask the user about the screen size

Select screen size:

For a screen size of 13.3, add $200 to the total price
For a screen size of 15.0, add 300 to the total price
For screen size of 17.3, add $400 to the total price
Then ask the user about the CPU

Select CPU type:

For a CPU of i3, add $150 to the total price
For a CPU of i5, add $250 to the total price
For a CPU of i7, add $350 to the total price
Then ask the user about the RAM size

Select RAM size:

Add $50 to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4
Then ask the user about the storage type and amount

Select storage type:

Select storage size:

For HDD, add $50 to the total price for every 500GB
For SSD, add $100 to the total price for every 500GB
Then ask the user about the screen resolution

Select screen resolution:

For FULLHD, add $100 to the total price
For 4K, add $200 to the total price
** At the end display the total price of the custom computer**

Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner
 */