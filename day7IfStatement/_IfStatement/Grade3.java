package day7IfStatement._IfStatement;

public class Grade3 {
    public static void main(String[] args) {
        int gradeLeve = 7;

        String result = ""; // temporary value

        if (gradeLeve >= 1 && gradeLeve <= 5) {
            result = "Elementary School";
        }

        if (gradeLeve >= 6 && gradeLeve <= 8) {
            result = "Midlle School";

            if (gradeLeve >= 9 && gradeLeve <= 12) {
                result = "High School";
            }
        }
        if (gradeLeve >= 13 && gradeLeve <= 16) {
            result = "college";
        }

        if (gradeLeve >= 16 && gradeLeve <= 18) {
            result = "Grad";}

            System.out.println("result = " + result);

    }
}

/*
2. An integer variable named gradeLevel is declared and given, Write a program to determine and print which school type someone is in
	Ex:
		gradeLevel = 3
	     output:
		Elementary School
    The grade level and types are:
        1 ~ 5: Elementary school
        6 ~ 8:
        9 ~ 12: High school
        13 ~ 16: College
        17 ~ 18: Grad School
      Assume that the given number is 1 ~ 18

 */