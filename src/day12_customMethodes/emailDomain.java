package day12_customMethodes;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = scan.nextLine();

        int begin = email.indexOf("@")+1;
       int end =email.indexOf(".");
       String domain = email.substring(begin,end);
        System.out.println(domain);
    }


   /* public static void capitalization(String first,String second){
        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        second = second.substring(0,1).toUpperCase() + second.substring(1).toLowerCase();
        System.out.println( first + " " + second);
*/


    }






/*
Create a method named capitalization that can format the first and last names of the person
and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */





/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */