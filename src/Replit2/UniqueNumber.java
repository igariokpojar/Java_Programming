package Replit2;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1:");
        int size1 = sc.nextInt();
        int[] arrayEx1 = new int[size1];
        System.out.println("Enter the elements of the array1:");

        for(int i=0; i<arrayEx1.length; i++) {
            arrayEx1[i] = sc.nextInt();
        }
        Arrays.sort(arrayEx1);
        for (int i=0;i<arrayEx1.length;i++)
            System.out.println(arrayEx1[i]);
        int i=0;
        System.out.println("Unique Elements in array:");
        while(i<arrayEx1.length)
        {
            if(arrayEx1[i]!=arrayEx1[i+1])
            {
                System.out.println(arrayEx1[i]);
            }
            i=i+2;
        }
    }


            }

