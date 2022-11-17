package interview;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();

            // TYPE YOUR CODE BELOW:
            String reverce = " ";

            String s[] = sentence.split(" ");

            for(int i=0;i<s.length;i++){
                reverce = s[i]+ " "+reverce;
            }

            System.out.print(reverce.trim());

        }
}
