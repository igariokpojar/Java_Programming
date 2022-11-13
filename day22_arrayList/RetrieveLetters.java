package day22_arrayList;

public class RetrieveLetters {

    public static void main(String[] args) {

       String str = "Wooden Spoon!";
       String letters = "";
       String digits = "";
       String specialChar = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                letters +=str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                digits +=str.charAt(i);
            } else if (!Character.isLetterOrDigit(str.charAt(i))) {
                specialChar += str.charAt(i);

            }

        }
        System.out.println("specialChar = " + specialChar);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);


    }
}
/*
 Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */