package Replit;

import java.util.Scanner;

public class MobNumb {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number:");
            int n1 = input.nextInt();
            System.out.println("Enter second number:");
            int n2 = input.nextInt();
            System.out.println("Enter third number:");
            int n3 = input.nextInt();
            String  result= "middle number is: ";

            if(n1>n2&&n1<n3||n1>n3&&n1<n2){result+=n1;
            }else if( n2>n3&&n2<n1||n2>n1&&n2<n3){result+=n2;
            }else{ result += n3;}


            System.out.println(result);

        }
}
/*
Using if statements and Scanner write a program that will read three number inputs.
 Then using those number determine which number is the middle number.
 Follow the exact flow from the examples below.
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
Main topics: if statements, primitive variables, operators, Scanner
 */