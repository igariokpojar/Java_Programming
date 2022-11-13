package day12_customMethodes;

import java.util.Scanner;

public class Sweets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        switch(version){
            case " version 1.5":
                System.out.println("Cupcake");
                break;
            case "1.6":
                System.out.println("Donut");
                break;
            case "2.1":
                System.out.println("Eclair");
                break;
            case "2.32":
                System.out.println("Froyo");
                break;
            case "2.3":
                System.out.println("Gingerbread");
                break;
            case "3.1":
                System.out.println("Honeycomb");
                break;
            case "4.0":
                System.out.println("Ice Cream Sandwich");
                break;
            case "4.1":
                System.out.println("Jelly Bean");
                break;
            case "4.4":
                System.out.println("Kitkat");
                break;
            case "5.0":
                System.out.println("Lollipop");
                break;
            case "8.0":
                System.out.println("Oreo");
                break;
            case "9.0":
                System.out.println("Pie");
                break;
            default:
                System.out.println("Not a valid version");

        }
        System.out.println(version);
    }
    }


