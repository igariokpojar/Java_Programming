package day08_ternary_switchstatement;

public class SwitchIntro {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {

            case 'B':
                System.out.println("Great Job");
                break;

            case 'A':
                System.out.println("Excellent");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");

        }

    }
}






/*
  A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
 */