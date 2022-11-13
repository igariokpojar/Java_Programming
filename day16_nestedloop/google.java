package day16_nestedloop;

public class google {
    public static void main(String[] args) {
        String word = "google";
        String vowels = "";
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            vowelCount=0;
            char ch = word.charAt(i);

            if (ch == ('a') || ch == ('e') || ch == ('i') || ch == ('o') || ch == ('u')) {

                for (int j = 1; j < word.length(); j++) {

                    char ch2 = word.charAt(j);
                    if (ch == ch2) {
                        vowelCount++;
                    }
                    if (vowelCount == 1 && j == word.length() - 1) {
                        vowels+=word.charAt(i);
                    }
                }
            }


        }
        if(vowels.equals("")){
            System.out.println("-1");
        }else{
            System.out.println(vowels);
        }
    }

}
