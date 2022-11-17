package day22_arrayList;

public class Replace {

    public static int[] replace(int[] array, int index, int newElement) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == index) {
                array[index] = newElement;
            }
        }
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == index) {
                array[index] = newElement;
            }
        }
        return array;
    }

    public static char[] replace(char[] array, int index, char newElement) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == index) {
                array[index] = newElement;
            }
        }
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == index) {
                array[index] = newElement;
            }
        }
        return array;
    }

    public static int[] replaceAll(int[] arr, int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static double[] replaceAll(double[] arr, double oldElement, double newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static char[] replaceAll(char[] arr, char oldElement, char newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }


    public static String[] replaceAll(String[] arr, String oldElement, String newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldElement)) {
                arr[i] = newElement;
            }
        }
        return arr;

    }

    public static int[] insert(int[] arr, int index, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (i == (index)) {
                arr[i] = element;
            }
        }
        return arr;
    }

    public static double[] insert(double[] arr, int index, double element) {
        for (int i = 0; i < arr.length; i++) {
            if (i == (index)) {
                arr[i] = element;
            }
        }
        return arr;
    }

    public static char[] insert(char[] arr, int index, char element) {
        for (int i = 0; i < arr.length; i++) {
            if (i == (index)) {
                arr[i] = element;
            }
        }
        return arr;
    }


    public static String[] insert(String[] arr, int index, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (i == (index)) {
                arr[i] = element;
            }
        }
        return arr;
    }

    public static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static String[] swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static double[] swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static char[] swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
/*
1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
 The method replaces the element of the array at given index with the new element, and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays
 */