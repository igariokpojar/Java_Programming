package day7IfStatement._IfStatement;

public class AgeGroups {
    public static void main(String[] args) {
        int age = (43);
        String print ="";
        if (age>=1&& age<=2){print="infant";}
        if (age>=3 && age<=5){print = "Toddler";}
        if (age>=6&&age<=9){print = "Kid";}
        if (age>=10&&age<=12){print = "Pre-Ten";}
        if (age>=13&&age<=17){print ="Teenager";}
        if (age>=18&&age<=20){print = "Yang Adult";}
        if (age>=21&&age<=39){print= "Adult";}
        if (age>=40&&age<=49){print = "Young-Middle-Age Adult";}
        System.out.println("print = " + print);


    }
}
/*
1. Create a class named AgeGroups, an integer variable named age is declared and given.
 write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement

 */