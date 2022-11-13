package day9_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= scan.nextInt();
        if (number%2==0){
            System.out.println("even number");
            }else{
            System.out.println("odd number");}
        }
    }

