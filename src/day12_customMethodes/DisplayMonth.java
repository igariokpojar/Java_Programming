package day12_customMethodes;

public class DisplayMonth {
    public static void main(String[] args) {
        monthN(6);
        weekday(5);
    }

    public static void monthN(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.err.println("Invalid num");
        }
        //--------------------------------------------------------------------
    }
        public static void weekday(int numb){
            switch (numb) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                System.out.println("Invalid day number");
            }
        }


    }

/*
Create a method named monthName that can display the name of the month based on the
given number to the method, if the number is invalid, then the method should print the error
 message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */

/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */