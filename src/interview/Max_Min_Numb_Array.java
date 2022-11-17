package interview;

public class Max_Min_Numb_Array {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 350, 40, -10, 30};

        int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...

            if(numbers[i] > max){ // compares the element of the array with current maximum number
                max = numbers[i]; // replace the current maximum number
            }

        }


        System.out.println("max = " + max);

    }
}

/*         Min numb method
 int[] num = {-5, 20, 500, 40, -1, 30};

        int min = num[0]; // assume that first element is the maximum number

        for (int i = 1; i < num.length; i++) { // i: 1, 2, 3, 4...

            if(num[i] < min){ // compares the element of the array with current maximum number
                min = num[i]; // replace the current maximum number
            }

        }


        System.out.println("min = " + min);
 */
