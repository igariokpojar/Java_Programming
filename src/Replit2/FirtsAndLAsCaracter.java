package Replit2;

import java.util.Scanner;

public class FirtsAndLAsCaracter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:
        String result = "";

        for (int j = 0; j <5 ; j++) {
            result += (words[j].substring(0, 1) + words[j].substring(words[j].length()-1)
                    + "\n");
        }
        System.out.print(result);
    }
}
