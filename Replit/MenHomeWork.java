package Replit;

import java.util.Scanner;

public class MenHomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Animal");
        String animal = scan.nextLine();
        System.out.println("Enter the name of the Food");
        String food = scan.nextLine();
        System.out.println(entry(animal, food));
    }

    public static String entry(String animal, String food){
        if(animal.charAt(0)==food.charAt(0) && animal.charAt(animal.length()-1)==food.charAt(food.length()-1))
            return "True";
        else return "False";
    }
}
