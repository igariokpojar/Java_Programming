package day7IfStatement._IfStatement;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 'd';
        String result = "";
        if (ch>=32 && ch<=47 || ch>=58 &&ch <=64 || ch>=91 && ch<=96 || ch>=123 && ch<=126)
        {result = "special character";}
        if (ch>=41 && ch <=90){result = "Upper Character";}
        if (ch>= 97 && ch<=122){result = "Lower Characters";}
        if (ch>= 48 && ch<=57){result = "digit";}
        System.out.println("result = " + result);

    }
}
/*
 Create a class named CharacterIdentity,
 and write a program that can identify if the given character is
 a digit or Alphabetic Character(A~Z or a~Z)
 or a special character.

		Ex:
			ch = '@'

	        output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may want check out the numbers of the characters on ASCII
		 table.

 */