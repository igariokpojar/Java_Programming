package day14_forLoop;

public class ReturnSumOfDigits {
    public static void main(String[] args) {
        String w = "A1B2C3";

        int sumOfDigits = 0;


        for (int i = 0; i <= w.length() - 1; i++) {
            if (w.charAt(i) >= 48 && w.charAt(i) <= 57) {
                sumOfDigits += w.charAt(i) - 48;
            }
        }
        System.out.println(sumOfDigits);
    }
}
