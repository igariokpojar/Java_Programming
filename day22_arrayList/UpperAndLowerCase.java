package day22_arrayList;

public class UpperAndLowerCase {

    public static void main(String[] args) {

       String str = "JAVA java";
       int upperCase = 0;
       int lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                lowerCase++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                upperCase++;

            }

        }
        boolean isequal = (upperCase==lowerCase);
        System.out.println(isequal);



    }
}
/*
 Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods

 */