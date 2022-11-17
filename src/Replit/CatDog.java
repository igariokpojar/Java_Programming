package Replit;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        str = str.toLowerCase();


        int i = 0;
        while(str.contains("cat")){

            str = str.replaceFirst("cat","app");

            i++;
        }



        int j = 0;
        while(str.contains("dog")){

            str = str.replaceFirst("dog","app");

            j++;
        }



        boolean cat_vs_dog = i == j;

        System.out.println(cat_vs_dog);



    }
}
