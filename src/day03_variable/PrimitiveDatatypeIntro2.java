package day03_variable;

public class PrimitiveDatatypeIntro2 {
    public static void main(String[] args) {
        // dataType variableName = Data
        char a = 'a';
        char b = 'b';
        // char ab ='ab';   (' ')use only for 1 character;
        System.out.println(a);
        System.out.println(b);
        System.out.println("___________________________");


        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = 45000;

        int sum = 'A' + 'B';
        //        65 + 66
        System.out.println("sum = " + sum);

        // boolean r1 = 123;
        // boolean r2 = 2.5;
        //boolean r3 = "Java";
        boolean r4 = true;
        boolean r5 = false;
        boolean r6 = 100 > 10;// true
        System.out.println("r6 = " + r6);
        boolean r7 = 0 < -1;// false
        System.out.println("r7 = " + r7);

    }

}
