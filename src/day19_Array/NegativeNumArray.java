package day19_Array;

public class NegativeNumArray {


        public static int negativeSum(int a[]) {
            int sum = 0;
            for (int x : a) {
                if (x < 0) sum += x;
            }
            return sum;
        }

        public static void main(String[] args) {
            int a[] = {13, -2, 3, -4, -5};
            int result = negativeSum(a);
            System.out.println("" + result);
        }
    }
    /*
    in java write a method that given an integer array, computes and returns the sum of all negative numbers in the array.

Example:

array: 13, -2, 3, -4, -5

result: x= -2 -4 -5;

x= -11
     */