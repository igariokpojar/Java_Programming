package day12_customMethodes;

public class Capitalization {
    public static void main(String[] args) {
        capitalization("cyDoe", "sCHooL");


    }

    public static void capitalization(String first, String second) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        second = second.substring(0, 1).toUpperCase() + second.substring(1).toLowerCase();
        System.out.println(first + " " + second);
    }
}
/*
Create a method named capitalization that can format the first and last names of the person
and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */