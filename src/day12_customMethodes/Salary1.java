package day12_customMethodes;

public class Salary1 {
    public static void main(String[] args) {
        salary(45,40);
        eligibleToVote(23,false);
    }
    public static void salary(double hRate, int weekHour){
        double grossIncome = (hRate*weekHour)*52;
        System.out.println("You make " + hRate + " per hour");
        System.out.println("You work " + weekHour + " hours in a week");
        System.out.println("You gross Income is " + grossIncome);
    }

    public static void eligibleToVote(int age,boolean isAmerican){
        if(age>=21 && isAmerican==true){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You not eligible to vote");
        }
    }
}

/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

 */
/*
7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
 */