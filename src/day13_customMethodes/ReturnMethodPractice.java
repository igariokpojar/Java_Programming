package day13_customMethodes;

public class ReturnMethodPractice {
    public static void main(String[] args) {
    boolean result= isOdd(23);
        boolean result1 = isEven(69);
         int numb = max(21,36);
      int numb1= min(56,58);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(numb);
        System.out.println(numb1);

    }
    public static boolean isOdd(int numb) {
        boolean isOdd;
        return isOdd = (numb % 2 != 0);
    }
    public static boolean isEven(int num) {
        boolean isEven;
        return isEven = (num % 2==0);
    }
    public static int max (int n1,int n2){
        return (n1>n2)?n1 :n2;
    }
    public static int min(int n3,int n4){
        return(n3<n4)?n3 :n4;
    }

}


/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */