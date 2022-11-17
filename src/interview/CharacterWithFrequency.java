package interview;

public class CharacterWithFrequency {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";//a2b1c3d1
        // a b c d
        //   2 1 3 1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);//to find the frequency of each ch we need to enter the index number of each character manually
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch){
                    frequency++;
                }
            }

            if (result.contains(""+ch)){//if the character is already included in the result
                continue;//skip that character and jump to the next character
            }
            result += ch +""+ frequency;


        }
        System.out.println(result);

       /*char ch = str.charAt(2);//to find the frequency of each ch we need to enter the index number of each character manually
       int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                frequency++;
            }
        }
        System.out.println(ch +": "+ frequency);
        */




    }
}
