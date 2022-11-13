package day22_arrayList;

public class MaxAndMinNumOfMultiDArray {

    public static void main(String[] args) {

        // index:          0     1     2      0    1    2      0    1   2
        int[][] array = {{100, 20000, 300}, {10, 1000, 50}, {-200, 400, 0}}; //indexes of array: 0 ~ 2
        // index of 1D array          0              1                2

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {

            for (int eachElement : each1D) {

                if (eachElement > max) {
                    max = eachElement;
                }

                if (eachElement < min) {
                    min = eachElement;
                }

            }

        }


        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);





/*
        System.out.println("__________________second method______________________________________________________");

        int [][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };
        int max=array[0][0];
        int min=array[0][0];

        for (int[] each : array) {
            for (int i : each) {
                if(i>max){
                    max=i;
                }if(i<min){
                    min=i;
                }
            }
        }
        System.out.println("The minimum number is: "+min+"\nThe maximum number is"+max);
*/

    }
}
/*
Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000
 */