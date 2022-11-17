package interview;

public class FindWordInSentence {

    public static int frequency(String sentence, String word) {

        int count = 0;
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());
            if (each.equals(word)) {
                count++;
            }
        }
        return count;
    }
}



// Second Method// return the frequency of the given word from the given sentence
     /*   public static int frequency;(String sentence, String word){

            int count = 0;

            while(sentence.contains(word)){
                sentence = sentence.replaceFirst(word, "");
                count++;
            }

            return count;
*/


