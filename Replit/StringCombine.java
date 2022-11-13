package Replit;

import java.util.Scanner;

public class StringCombine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW
        if (word1.length() == 3 && word2.length() == 3) {
            System.out.println(word1.substring(0, 1) + word2.substring(0, 1) + word1.substring(1, 2) +
                    word2.substring(1, 2) + word1.substring(2, 3) + word2.substring(2, 3));
        } else {

            System.out.println("cannot merge");

        }
    }
}










        /*char firstChar = word1.charAt(0);
        char secondChar = word1.charAt(1);
        char thirdChar = word1.charAt(2);
        char fourthChar = word2.charAt(0);
        char fifthChar = word2.charAt(1);
        char sixthChar = word2.charAt(2);
        System.out.print( firstChar);
        System.out.println(fourthChar);
        System.out.print( secondChar);
        System.out.println(fifthChar);
        System.out.print(thirdChar );
        System.out.print(sixthChar);
*/









  /*
        if(word1.length()<=2 || word2.length()<=2){
            System.out.println(word1+word2);
        }else {
            System.out.println("cannot merge");
 */







