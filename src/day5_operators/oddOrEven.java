package day5_operators;

public class oddOrEven {
    public static void main(String[] args) {
        int number = 20;
        boolean evenNumber = number %20 ==0;
        boolean oddNumber = number %20 !=0;
        System.out.println("\t"+number + " is an even number:" + evenNumber);
        System.out.println("\t"+number + " is an odd number:" + oddNumber);

    }
}
