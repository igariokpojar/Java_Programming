package Replit2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // 1. Make storage for the shortest words
        ArrayList <String> shortest = new ArrayList<>();
        String[] inputList = str.split(", ");

        // 2. Find what the shortest length is
        int shortestLength = Integer.MAX_VALUE;
        for (String word : inputList) {
            if (word.length() < shortestLength) {
                shortestLength = word.length();
            }
        }

        // 3. Add all words that have the shortest length to our result
        for(String word : inputList){
            if (word.length() == shortestLength) {
                shortest.add(word);
            }
        }

        // 4. Print our result
        System.out.println(shortest);
    }
}
