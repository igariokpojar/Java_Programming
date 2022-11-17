package day5_operators;

public class relationalOperators {
    public static void main(String[] args) {
        int a  = 1000;
        int b = 200;
        System.out.println(a>b);

        boolean aIsGrater = a>b;
        System.out.println("aIsGrater = " + aIsGrater);

        int score = 58;
        boolean passed = score>60;
        System.out.println("passed = " + passed); /// false

        int age = 35;
        boolean eligibleToByAlcohol = age>=21;
        System.out.println(eligibleToByAlcohol);

        boolean eligibleToVote = age>=18;
        System.out.println( eligibleToVote);
        System.out.println(100>100); // false
        System.out.println(100>=+100); // true
        System.out.println(100>=85); // true

        score = 48;
        boolean failed = score < 60;
        System.out.println( failed);


        System.out.println(95<=100);// true
        System.out.println(100<=100); //true

        System.out.println('a'>'b');
        //                  65>66






    }
}
