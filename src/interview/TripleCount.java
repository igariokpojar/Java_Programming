package interview;

import java.util.Scanner;

public class TripleCount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for (int i = 0; i < str.length()-2; i++) {
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i + 1) && tmp == str.charAt(i + 2))
                count++;
        }
        System.out.println(count);
    }
}
