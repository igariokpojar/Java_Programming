package day7IfStatement._IfStatement;

public class NumberToWord {
    public static void main(String[] args) {
        int n = 1;
        String word = "";
        if (n==0){word = "zero";}
        if (n==1){word = "one";}
        if (n==2){word = "two";}
        if (n==3){word = "three";}
        if (n==4){word = "four";}
        if (n==5){word = "five";}
        if (n==6){word = "six";}
        if (n==7){word = "seven";}
        if (n==8){word = "eight";}
        if (n==9){word = "nine";}
        System.out.println("word = " + word);
    }
}
/*
Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */