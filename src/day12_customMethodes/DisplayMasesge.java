package day12_customMethodes;

public class DisplayMasesge {

    public static void main(String[] args) {

       displayMesage();
       displayValue(5);
       OddOrEven(21);
    }

    public static void displayMesage(){
        System.out.println("Hello world");
        System.out.println("I love Java");
    }
    public static void displayValue(int num){
        System.out.println(" The valie is " + num);

    }
    public static void OddOrEven(int num){
        if (num%2==0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
    }
}
