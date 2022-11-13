package utilities;

public class MathUtilities {

    public static void main(String[] args) {

       boolean str =  MathUtilities.isPoli("Racecar");
        System.out.println(str);

        System.out.println(isPalindrome("Alla"));


    }
    public static boolean isPoli(String str){

        String s  ="";

        for (int i = str.length()-1; i >=0 ; i--) {
           s+= str.charAt(i);
        }
        if (str.equalsIgnoreCase(s)){
            return true;
        }else {
            return false;
        }

    }
    public static boolean isPalindrome(String s) {

        for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {

           s= s.toLowerCase();

            if ( s.charAt(i) != s.charAt(j) ) {
                return false;
            }
        }

        return true;
    }

}


