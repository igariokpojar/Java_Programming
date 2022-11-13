package day7IfStatement._IfStatement;

public class minimumNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        if (num1>num2) {
            System.out.println(num2 + "max number");
        }
        if (num1<num2) {
            System.out.println(num1 + " is the minimum number");
        }
        if (num1==num2) {
            System.out.println(num1 + "equal");
        }
    }
}