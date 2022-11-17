package day14_forLoop;

public class Palindrome {
    public static void main(String[] args) {
        String w = "level";
        String reverse = "";
        boolean isPalindrome;

        for (int i = w.length() - 1; i >= 0; i--) {

            reverse += w.charAt(i);

        }
        if (w.equalsIgnoreCase(reverse)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
