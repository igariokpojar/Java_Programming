package interview;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Programming Language";
        System.out.println(str.length()-1);

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){

            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        String name = "Igor Pojar";
        //System.out.println(reverse("Igor Pojar"));
        reverse = reverse("Igor Pojar");
        System.out.println(reverse);

    }

    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i--) {
            reverse +=str.charAt(i);
        }

        return reverse;
    }
}
