package day9_Scanner;

import java.util.Scanner;

public class MontNameScann {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String month = "";
        if (num >= 1 && num <= 12) {

            if (num == 1) month = "January";
            else if (num == 2) month = "February";
            else if (num == 3) month = "March";
            else if (num == 4) month = "April";
            else if (num == 5) month = "May";
            else if (num == 6) month = "Jun";
            else if (num == 7) month = "July";
            else if (num == 8) month = "August";
            else if (num == 9) month = "September";
            else if (num == 10) month = "October";
            else if (num == 11) month = "november";
            else month = "December";
        } else {
            month = "No such a month";}
        System.out.println(month);

        System.out.println("_________________________________________________");
        System.out.println("Enter the age");
        int age = scan.nextInt();

        if (age >= 21){
            System.out.println("You are eligible to buy cigarettes");
        }


        if(age < 21 || age > 100){
            System.err.println("You are not eligible to buy cigarettes");
        }




    }
}


