package utilities;

import java.util.*;

public class ArrasUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity
        // to contain all the elements of arr1 and arr2

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;


    }


    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }


    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }


    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }


    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }


    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;


    }


    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;

    }


    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;


    }


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

    public static void populate(int n)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        System.out.println(list);
    }

    public static int getDup(String[] r) {

        int n = r.length;
        int dup = 0;
        for (int i = 0; i < n; i++) {

            boolean flag = false;
            for (int j = 0; j < n; j++) {

                if (r[i] != null && r[i].equals(r[j]) && i != j) {

                    if (flag == false) {
                        dup += 2;
                        flag = true;
                    } else {
                        dup++;
                    }

                    r[j] = null;
                }
            }
        }
        return dup;
    }

    public static ArrayList<Integer> combineAL(ArrayList<Integer> numbersOne,
                                               ArrayList<Integer> numbersTwo) {
        ArrayList<Integer> result = new ArrayList<>();


        result.addAll(numbersOne);
        result.addAll(numbersTwo);
        return result;
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> positiveNum = new ArrayList<>();
        int sum = 0;
        for(int num : list){
            if(num > 0){
                positiveNum.add(num);
                sum += num;
            }
        }
        positiveNum.add(sum);

        return positiveNum;
    }

    public static String search(ArrayList<String> list, String find) {

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i).contains(find)) {
                return list.get(i);
            }
        }
        return "search failed";
    }


    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {

        String temp=list.get(pos1);
        list.set(pos1,list.get(pos2));
        list.set(pos2,temp);

        return list;
    }


    static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list) {
        ArrayList<Boolean> temp = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < 2 * list.size(); i++) {
            temp.add(list.get(j));
            j++;
            if (j == list.size()) {
                j = 0;
            }
        }
        return temp;
    }

    public static ArrayList<String> removeEveryOther(ArrayList<String> words)
    {
        ArrayList <String> newList = new ArrayList<>();
        for(int i = 1 ; i < words.size() ; i = i + 2)
        {
            String str = words.get(i);
            newList.add(str);
        }

        return newList;
    }

    public static ArrayList<String> removeAll(ArrayList<String> list2, String target2){
        for(int i = 0; i < list2.size();i++){
            if(list2.get(i).equals(target2)){
                list2.remove(list2.get(i));
                i--;
            }
        }

        return list2;
    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> list,Integer n) {

        ArrayList<Integer> newList = new ArrayList<>();
        for(int num : list){
            if(num != n){
                newList.add(num);
            }
        }

        return newList;
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

    public static boolean String(String str) {

            String s = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                s += str.charAt(i);

            }
            if (str.equalsIgnoreCase(s)) {
                return true;

            } else {
                return false;
            }
        }

        public static LinkedHashMap<Character,Integer> Frequency(String str){

                LinkedHashMap<Character,Integer> word = new LinkedHashMap<>();

                for (Character each : str.toCharArray()){
                    if (word.containsKey(each)){
                        word.put(each,word.get(each)+1);
                    }else{
                        word.put(each,1);
                    }
                }

                return word;
            }

        }



