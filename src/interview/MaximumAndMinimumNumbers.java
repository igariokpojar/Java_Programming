package interview;

import java.util.Scanner;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648;// Any integer number that use enters will ALWAYS be less than 2147483648
        int min = 2147483647;//Any integer number that use enters will ALWAYS be greater than 2147483648

        for (int i = 1; i <= 5; i++){

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }

        }
        System.out.println("max number is = " + max);
        System.out.println("min number is = " + min);
    }
}
