package day7IfStatement._IfStatement;

public class ChooseLanguage {
    public static void main(String[] args) {
        int language = 4;
        String result =  "";
        if (language == 1){result = " Hello, thank for your call";}
        if (language==2){result = "Hola,gracias para llamar";}
        if (language==3){result = "Merhaba, aradiginiz icin tesekkuler";}
        if (language==4){result = "Privet.spasiba za vash zvanok";}
        System.out.println("result = " + result);
    }
}
/*
Creat a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
 Write a program that can select the language based on the number that's given
 in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement


 */