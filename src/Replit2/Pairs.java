package Replit2;

import java.util.Scanner;

public class Pairs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODE BELOW:

        int first=0;
        int second =1;

        while(second!=arr.length)
        {
            System.out.println(arr[first]+"," + " " +arr[second]);
            first++;
            second++;
        }
    }
}
