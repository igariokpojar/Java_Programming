package interview;

public class SwappingNumbers_SwitchingValues {
    public static void main(String[] args) {
        //swapping numbers with third variable(empty bucket) method

        int a = 20;
        int b = 30;
        int c = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("---------------------------------------------------------------");

        // swapping numbers without a third variable

        int n1 = 20;
        int n2 = 10;

        n1 = n1 + n2;//30
        n2 = n1 - n2;//20
        n1 = n1 - n2;//10

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

    }
}
