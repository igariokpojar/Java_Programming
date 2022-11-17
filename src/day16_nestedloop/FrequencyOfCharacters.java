package day16_nestedloop;

import java.util.concurrent.Callable;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbbccccmmmdddd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int numb = 0;

            for (int s = 0; s < str.length(); s++) {
                if (str.charAt(s) == ch) {
                    numb++;
                }
            }
            if (!result.contains("" + ch)) {
                result += numb + "" + ch;

            }
        }
        System.out.println( result);
    }
}



    
/*
 FrequencyOfCharacters:
			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5

 */
/*
 sentence = sentence.toLowerCase();

        int n = 0;

        while (sentence.contains("java")){
            n++;
            sentence = sentence.substring(sentence.indexOf("java")+1);
        }
        System.out.println(n);
 */