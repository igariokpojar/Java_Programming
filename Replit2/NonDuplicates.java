package Replit2;

import java.util.Scanner;

public class NonDuplicates {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:
        for (int i = 0; i < nums.length; i++) {
            boolean dup = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    dup = true;
                    break;
                }
            }
            if (! dup) {
                System.out.println(nums[i]);

            }
        }
    }
}
