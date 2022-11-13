package day24_dateAndTime;

import java.time.LocalDate;

public class BornOnLeapYear {

    public static void main(String[] args) {

        System.out.println(bornOnLeapYear(1983));


    }

    public static boolean bornOnLeapYear(int birdYear){
        if (LocalDate.of(birdYear, 1,1).isLeapYear()){
            return true;
        }else {
            return false;
        }

    }

}
/*
 Create a function that accepts an int argument birthYear,
  return true if the person was born on leap year, otherwise return false
 */