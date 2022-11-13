package day7IfStatement._IfStatement;

public class ifStatementsIntro {
    public static void main(String[] args) {

            int number = 200;

            boolean isPositive = number > 0;
            boolean isNegative = number < 0;
            boolean isZero = number == 0;


            if (isPositive) {
                System.out.println(number + " is positive number");
            }

            if (isNegative) {
                System.out.println(number + " is negative number");
            }

            System.out.println(number + " is negative number");
            if (isZero) {
                System.out.println(number + " is zero");
            }

        }
    }

