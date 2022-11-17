package day5_operators;

public class unaryOperators {
    public static void main(String[] args) {
        int a =25;
        System.out.println(++a);
        System.out.println(--a);
        // pre increment/decrement
        int x = 10;
        System.out.println(++x);

        int y = 100;

        System.out.println(--y);
        System.out.println(y);
        System.out.println("_________________________");
        // post increment/postincrement
        int a1 =50;
        System.out.println(a1++); // 50
        System.out.println( a1 );

        int b = 25;
        System.out.println(b--); //25
        System.out.println(b);

        System.out.println("______________________________");

        int n = 30;
        int m = n++;// m = 30
        System.out.println("n = " +n);
        System.out.println("m = " +m);
        int n1 =30;
        int m1 = n1;
        System.out.println("m1 = " + m1);

        int f = 25;
        System.out.println(f++);
        System.out.println(f++);
        System.out.println(--f);
        System.out.println(f--);

        System.out.println("______________________________");

        int b1 = 35;
        b1 %= 7; //  b  = 35%7
        System.out.println("b1 = " + b1);
        System.out.println("_______________________");
        int x2 = 86;
        int y3 = 104;
        System.out.println(++x2);
        System.out.println(--y3);
        int l = 50;
        int g = 23;
        System.out.println(l++);
        System.out.println(l);
        System.out.println(g--);
        System.out.println(g);

        int u = 30;
        int t = u++;
        System.out.println("t = " + t);
        System.out.println("u = " + u);
        int z = 60;
        int q = z--;
        System.out.println("q = " + q);
        System.out.println("z = " + z);


        int j = 75;
        j%= 6;//  j=75/6= %3
        System.out.println("j = " + j);














    }
}
