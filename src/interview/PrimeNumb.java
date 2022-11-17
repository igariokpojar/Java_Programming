package interview;

public class PrimeNumb {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 to 500");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
