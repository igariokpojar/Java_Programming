package day15_wileLoop;

public class FrequencyOfJavaWhileMethode {
    public static void main(String[] args) {
        String str = "My favorite programming language is Java, I love jAva, JAVA is so cool";

        str = str.toLowerCase();

        String str1 = "java";




        int i = 0;
        while(str.contains(str1)){

            str =  str.replaceFirst("java", " ");// replace  and we remove Java one by one in the sentence

            i++;
        }
        System.out.println(i);
    }
}
