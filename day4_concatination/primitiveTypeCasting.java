package day4_concatination;

public class primitiveTypeCasting {
    public static void main(String[] args) {
        byte a = 15;
        short b = a;
        System.out.println("short");
        int c = a; // implicit casting
        System.out.println("c = " + c);
        long d = 3000l;
        float f = d;// implicit casting

        System.out.println("___________________");

        // ----- explicit casting----------
        int x = 100;
        byte y = (byte) x; // explicit casting

        float z = 20.8f;// z = 20.8
        short q = (short) z; // this casting must be due manually
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1; // n1 = 2.5
        System.out.println(n2);

        int num = 500;
        byte result = (byte) num; // explicit casting
        System.out.println(result);
        double u = 3000.5;
        int p = (int) u;
        System.out.println(p);

        int o = 100;
        double d1 = o;
        System.out.println(d1); // result is 100.0 = because Double
        // contains decimals.



    }
        }






