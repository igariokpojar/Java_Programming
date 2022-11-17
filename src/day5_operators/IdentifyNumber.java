package day5_operators;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;
        boolean positiveNumber = number> 0;
        boolean negativeNumb = number<0;
        boolean isZero = number == 0;
        System.out.println("positiveNumber = " + positiveNumber);
        System.out.println("negativeNumb = " + negativeNumb);
        System.out.println("zero = " + isZero);

        boolean b = true;
        System.out.println("\t"+number + " is positive number:" + positiveNumber);
        System.out.println("\t"+number + " is negative number:" + negativeNumb );
        System.out.println("\t"+number + " is zero:" + isZero);
    }
}
