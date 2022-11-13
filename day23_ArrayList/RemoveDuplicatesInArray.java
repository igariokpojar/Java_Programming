package day23_ArrayList;

import static utilities.ArrasUtility.addElement;
import static utilities.ArrasUtility.contains;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {


    }

    public static int[] removeDuplicatesInArray(int[] arr1) {
        int[] arr2 = new int[0];
        for (int element : arr1) {
            if (!contains(arr2, element)) {
                int num = element;
                arr2 = addElement(arr2, num);
            }
        }
        return arr2;

    }
}