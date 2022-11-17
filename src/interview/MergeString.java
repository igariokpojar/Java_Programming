package interview;

public class MergeString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "apple";

        System.out.println( merge("Java", "apple"));

    }
    public static String merge(String str1, String str2){
        String result;
        if (str1.endsWith( ""+str2.charAt(0) )  ){
            result = str1 + str2.substring(1);
        }else {
            result = str1 + str2;
        }




        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }
        return result;

    }
}
