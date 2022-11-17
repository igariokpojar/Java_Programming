package interview;

public class CharacterRepeatedTwice {
    public static void main(String[] args) {
        String str = "aaabbcccddeeeff";

        String result = ""; //bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++){// inner loop responsible for comparing ch te each character of the str and return the frequency of ch

                if (str.charAt(i) == ch){
                    count++;
                }

            }
            if (count == 2 && !result.contains(""+ch)){//!result.contains(""+ch)// avoids duplicates
                result += ch;
            }
        }


        System.out.println(result);

    }
}
