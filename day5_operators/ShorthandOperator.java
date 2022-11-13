package day5_operators;

public class ShorthandOperator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);//20
        a = 40;
        System.out.println(a);//40
        a = 90;
        System.out.println(a);//90

        System.out.println("______________________");

        double balance = 100;
        balance += 1000; // balance = 100+1000
        System.out.println("balance = " + balance);

        balance  += 500; // balance= 1100 + 500
        System.out.println("balance = " + balance);

        balance -= 1000;
        System.out.println("balance = " + balance);

        balance-= 5000;
        System.out.println("balance = " + balance);
        System.out.println("____________________________");
        double salary = 45000;
        salary *=2; // salary = 45000*2
        System.out.println("salary = " + salary);

        salary*= 3;
        System.out.println("salary = " + salary);

        double doge_coint = 4;
        doge_coint*=250;
        System.out.println("doge_coint = " + doge_coint);



    }
}
