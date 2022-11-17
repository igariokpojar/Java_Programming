package Replit;

import java.util.Scanner;

public class lastChens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        for (int i = 0; i < sentence.length()-"java".length(); i++) {
            System.out.print(i);

        }


    }
}
