package practice;

import utilities.StringUtility;

import javax.swing.text.Utilities;

public class Palindrome {

    public static void main(String[] args) {

        boolean str = StringUtility.isPalindrome("alla");
        System.out.println(str);

    }

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            reverse += ch;
        }
        if (reverse.equals(s)) {
            return true;
        } else {
            return false;

        }


    }


}
