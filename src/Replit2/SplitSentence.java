package Replit2;

import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:
        String[] arrSplit = sentence.split("\\s");
        for (int i=0; i < arrSplit.length; i++){
            System.out.println(arrSplit[i]);
        }
    }
}
