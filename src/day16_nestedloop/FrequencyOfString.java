package day16_nestedloop;

public class FrequencyOfString {
    public static void main(String[] args) {
        String str = "aabcccd";//a2b1c3d1

        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (!result.contains("" + ch)) {
                result += ch + "" + count;

            }
        }
        System.out.println(result);

    }
}
/*
 Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters


 */