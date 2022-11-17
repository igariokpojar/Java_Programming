package day23_ArrayList;

import java.util.ArrayList;

public class ExtractSpecialCharacters {

    public static void main(String[] args) {

       String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> num = new ArrayList<>();
        ArrayList<Character> letter= new ArrayList<>();
        ArrayList<Character> ch = new ArrayList<>();

        for(char each : str.toCharArray()){
            if (Character.isLetter(each)){
                letter.add(each);
            }
            if (Character.isDigit(each)){
                num.add(each);
            }
            if (!Character.isLetterOrDigit(each)){
                ch.add(each);
            }
        }
        System.out.println("ch = " + ch);
        System.out.println("letter = " + letter);
        System.out.println("num = " + num);



    }
}
/*
Write a program that can extract the special characters, digits and letters from a string and stores them into
 separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */