package Replit2;

import java.util.Scanner;

public class Result {

    public static void main(String[] args) {


        String[] words = {" java","java","java","java","java" };


        String result = "";

        for (int j = 0; j < 5; j++) {
            result += (words[j].substring(0, 1) + words[j].substring(words[j].length()-1) + "\n" );
        }
        System.out.println( result.substring(0, result.length()));
    }
}
