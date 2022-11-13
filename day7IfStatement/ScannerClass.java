package day7IfStatement;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        int numb = input.nextInt();
        input.nextLine();

        System.out.println("Enter your sentence:");
        String secondSentence = input.nextLine();


        System.out.println("numb = " + numb);
        System.out.println("secondSentence = " + secondSentence);
    }
}
