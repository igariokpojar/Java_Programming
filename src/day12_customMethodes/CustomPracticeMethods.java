package day12_customMethodes;

public class CustomPracticeMethods {
    public static void main(String[] args) {
        eligibleToByAlcohol(18);
        oddOrEvenOrZero(0);
        initial("igor","pojar");
    }

    public static void eligibleToByAlcohol(int age) {
        if (age >= 21) {
            System.out.println(age + " eligible to by alcohol");
        } else {
            System.out.println(age + " not eligible to by alcohol");
        }
            }public static void oddOrEvenOrZero ( int number){
            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            }else if (number % 2 != 0){
            System.out.println(number + " is a odd number");
        }else if(number==0)
                System.out.println(number + " equal to zero");

    }

    public static void initial (String firsName,String LastName){
        String initial = firsName.charAt(0) + "." + LastName.charAt(0);
        System.out.println(initial );
    }

        }






