package day19_Array;

public class Classmates {
    public static void main(String[] args) {

        String[] classMates = {"Igor Pojar","Alexandru Pojar","Alla Cib","Maria Pojar","Ion pojar","Anna Pojar"};

        for (int i = 0; i < classMates.length; i++) {
            System.out.println(classMates[i].charAt(0) +
                    " " + classMates[i].charAt(classMates[i].indexOf(" ")+1));

        }
    }
}
/*
 create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate's in separate lines

 */