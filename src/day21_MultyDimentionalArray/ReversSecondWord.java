package day21_MultyDimentionalArray;

public class ReversSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] splitSent = sentence.split(" ");

        String result = "";

        for (int i = 0; i < splitSent.length; i++) {
            if(i == 1){
                String word = splitSent[i];
                for(int j = word.length() - 1; j >= 0; j --){
                    result += word.charAt(j) ;
                }
                result += " ";
            } else {
                result +=  splitSent[i] + " ";
            }
        }

        System.out.println(result);
    }
}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */