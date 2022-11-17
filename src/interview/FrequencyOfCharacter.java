package interview;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "cccccccaabbbcccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {//i: index numbers of str

            if (str.charAt(i) == ch) {
                count++;
            }

            System.out.println(count);

        }
    }
}