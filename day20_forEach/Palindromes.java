package day20_forEach;

public class Palindromes {

    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};

        String revers = "";
        int count = 0;

        for(String each : arr){
            for (int i = each.length()-1; i >=0 ; i--) {

                revers += each.charAt(i);

                if (each.equalsIgnoreCase(revers)){
                    count++;
                }
            }
            revers = "";
        }
        System.out.println(count);




    }
}
/*
 write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */