package day13_customMethodes;

public class Combine {
    public static void main(String[] args) {

        System.out.println(combine("one","eight"));
        System.out.println(sumOf2Numbers(12,39));
        System.out.println(sumOf3Numbers(65,89,230));
        System.out.println(sumOf4Numbers(789,546,1254,4));

    }
    public static String combine(String str1,String str2){
        String result = str1.substring(0,3)+str2.substring(1);
        return result;

    }


    public static int sumOf2Numbers(int i1,int i2){
        int sum = i1+i2;
        return sum;
    }
    public static int sumOf3Numbers(int n1,int n2, int n3){
        int sum = n1+n2+n3;
        return sum;
    }
    public static int sumOf4Numbers(int f1,int f2,int f3,int f4){
        int sum = f1+f2+f3+f4;
        return sum;
    }

}









/*
Task1:
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter
         are the same, return that character once.

        combine("one", "eight")  ==> oneight

Task 2:
    1. create a method that can find the sum of two integer numbers
                method name: sumOf2Numbers

    2. create a method that can find the sum of three integer numbers
                method name: sumOf3Numbers

    3. create a method that can find the sum of four integer numbers
                method name: sumOf4Numbers
 */