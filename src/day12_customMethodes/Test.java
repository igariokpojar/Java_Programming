package day12_customMethodes;

public class Test {
    public static void main(String[] args) {
        int number = 300;
        CustomMethodsWithParameter.oddOrEven(300);
        maxNum(125, 301);
        iNi("igor", "pojar");
        daysOfMonth("April");
    }

    public static void maxNum(double numb1, double num2) {
        if (numb1 > num2) {
            System.out.println(numb1 + " is the max numb");
        } else if (num2 > numb1) {
            System.out.println(num2 + " is the max numb");
        } else {
            System.out.println("equal");
        }
    }

    public static void iNi(String firstN, String lastN) {
        String iNi = firstN.charAt(3) + "." + lastN.charAt(4);
        System.out.println(iNi);
    }

    public static void daysOfMonth(String month) {
        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
        String result;
        switch (month) {
            case "February":
                result = (month+ " has 28 days");
                break;
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                result = (month+ " has 31 days");
                break;

                case "April":
                case "Jun":
                case "September":
                case "November":
                result= (month+ " has 30 days");
                break;

            default:
                result = ("Invalid number");
        }
        System.out.println(result);

    }
}

/*
// create a method that can print the maximum number between two numbers,
    // if both are equal then it prints "Equal", (num1, num2)
 */