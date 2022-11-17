package day12_customMethodes;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {
        oddOrEven(100);
    }

    // the method takes an argument number and verifies if is odd or even number

    public static void oddOrEven(int number){

        if (number%2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }

    }


}
