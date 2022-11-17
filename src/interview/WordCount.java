package interview;

import java.util.Scanner;

public class WordCount {
        public static int wordCount(String words) {
            // your code
            int count = 1;

            for (int i = 0; i < words.length() - 1; i++)
            {
                if ((words.charAt(i) == ' ') && (words.charAt(i + 1) != ' '))
                {
                    count++;
                }
            }
            return count;

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(wordCount(in.nextLine()));
    }
}
