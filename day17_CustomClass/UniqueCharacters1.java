package day17_CustomClass;

public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index number
            char each = str.charAt(i);

            if (str.indexOf(each)== str.lastIndexOf(each)){
                unique += each;
            }
        }
        System.out.println(unique);

    }
}
