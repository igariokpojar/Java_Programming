package day20_forEach;


public class ReversTheWord {
    public static void main(String[] args) {

        String sentence = "I love Java";
        String wordsArr[] = sentence.split(" ");
        String temp = "";
        for (int i = wordsArr[1].length()-1; i >=0 ; i--) {
            temp+=wordsArr[1].charAt(i);
        }
        System.out.println(sentence.replace(wordsArr[1],temp));


        System.out.println("__________________second method_____________________________________________________");

        String sentenc="I love Java";
        char [] rev="love".toCharArray();
        String lov=rev[3]+rev[2]+rev[1]+rev[0]+"";
        sentenc=sentenc.replace("love","evoL");
        System.out.println(sentenc);

    }
}



/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */