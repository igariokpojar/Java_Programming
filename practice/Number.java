package practice;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);}
    
    }

