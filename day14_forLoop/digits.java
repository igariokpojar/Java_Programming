package day14_forLoop;

public class digits {
    public static void main(String[] args) {
        String w = "mn@#123Ab!";
//                  0123456789


        String letters = "", digits = "", specialChars = "";
        int a = w.length() - 1;
        for (int i = 0; i <= a; i++) {
            if (w.charAt(i) >= 48 && w.charAt(i) <= 57) {
                digits += w.charAt(i);
            }
            if (w.charAt(i) >= 65 && w.charAt(i) <= 90 || w.charAt(i) >= 97 && w.charAt(i) <= 122) {
                letters += w.charAt(i);
            }
            if (w.charAt(i) >= 32 && w.charAt(i) <= 47 || w.charAt(i) >= 58 && w.charAt(i) <= 64 || w.charAt(i) >= 91 && w.charAt(i) <= 96
                    || w.charAt(i) <= 123 && w.charAt(i) >= 126) {
                specialChars += w.charAt(i);
            }
        }
        System.out.println("letter = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
