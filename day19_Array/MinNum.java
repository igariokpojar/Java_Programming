package day19_Array;

public class MinNum {
    public static void main(String[] args) {

        int[] num = {-5, 20, 500, 40, -1, 30};

        int min = num[0]; // assume that first element is the minimum number

        for (int i = 1; i < num.length; i++) { // i: 1, 2, 3, 4...

            if(num[i] < min){ // compares the element of the array with current minimum number
                min = num[i]; // replace the current minimum number
            }

        }


        System.out.println("min = " + min);

    }
}
