package interview;

public class CamelCase {

    public static String camelCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            output = Character.isUpperCase(ch) ? output + " " + ch : output + ch;
        }
        return output;
    }

    public static void main(String[] args) {
        String str = camelCase("iLoveJava");
        System.out.println(str);
    }
}
