package Replit2;

import java.util.Scanner;

public class Has55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TYPE YOUR CODE BELOW:
        int second = 0;
        for(int i=0;i<5;i++)
        {
            if(nums[i]==5 && i!=4)
            {
                if(nums[i+1]==5)
                {
                    second=1;
                    System.out.print("true");
                    break;
                }
            }
        }
        if(second==0)
        {
            System.out.println("false");
        }

    }
}
