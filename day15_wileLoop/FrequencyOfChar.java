package day15_wileLoop;
import java.util.*;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String and a char");
        String str = input.next();
        char ch = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if(eachChar == ch){
                frequency ++;
            }
        }

        System.out.println(frequency);



    }
}


