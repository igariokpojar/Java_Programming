package day7IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score = 59; // 0 ~ 100

        char grade;

        if(score >= 90){ // false: score < 90
            grade = 'A';
        }else if(score >= 80){ //false: score < 80
            grade = 'B';
        }else if(score >= 70){ // false: score < 70
            grade = 'C';
        }else if(score >= 60 ){ // false: score < 60
            grade ='D';
        }else{ // score < 60
            grade = 'F';
        }


        System.out.println(grade);

        System.out.println("__________________________________");

       char grade2 = (score >= 90)? 'A': (score >= 80) ? 'B' : (score >= 70) ? 'C'
                : (score >= 60) ? 'D':'F';


    }
}
/*
. An integer variable named score is declared and given, Write a
program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100

 */