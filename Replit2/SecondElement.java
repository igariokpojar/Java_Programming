package Replit2;

import java.util.Scanner;

public class SecondElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW

        int second = nums[1];
        System.out.println("Second element: " + second);

        int second_toLast = nums[nums.length - 2];
        System.out.println("Second to last element: " + second_toLast);
    }
}
