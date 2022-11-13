package Replit;


import java.util.Scanner;

public class Java_Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int java=0;
        int python=0;
        for(int i=0;i<sentence.length()-5;i++){
            if(sentence.substring(i,i+4).contains("java")){
                java++;
            }else if(sentence.substring(i,i+6).contains("python")){
                python++;
            }
        }
        String results=(python==java)?"true":"false";
        System.out.println(results);
    }
}
 /*                  Second method;

  int i = 0;
        while(sentence.contains("java")){

            sentence = sentence.replaceFirst("java","app");

            i++;
        }
        int j = 0;
        while(sentence.contains("python")){

            sentence = sentence.replaceFirst("python","app");

            j++;
        }
         boolean java_vs_python = i == j;

        System.out.println(java_vs_python);
  */