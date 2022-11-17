package interview;

public class RemovingDuplicate {
    public static void main(String[] args) {
        String str = "abbbcccdddd";

        String result = "";

        for (int i = 0; i < str.length(); i++){//i : index numbers of str

            char each = str.charAt(i); // each character of the string str
            if (  !result.contains( ""+each )  ){//if the string result does not contain the character of string str yet.
                result += each;// then will add the character to string result
            }
        }// if the character is not contained yet in the new string, then it will add it to the new string.

        System.out.println("result = " + result);
    }
}
