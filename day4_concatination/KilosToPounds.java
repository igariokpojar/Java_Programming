package day4_concatination;

public class KilosToPounds {
    public static void main(String[] args) {
        double kg = 10.5;
        double lb = kg*2.2;
        System.out.println(kg+ " kilos is equal to " + lb + " pounds ");
        System.out.println("_____________________________________");
        int g = 10;
        double l = 3.79;
        System.out.println(g+ " gallons is equal to " +l + " pounds ");
        System.out.println("_____________________________________________");

        int side = 5;
        int area = 5*5; // area = s*2
        int perimeter = 4*5;// perimeter = 4s
        System.out.println("Area of the square is " + area );
        System.out.println("Perimeter of the square is " + perimeter);
        System.out.println("___________________________________________");
        double radius = 5;
        double area1 = 3.14 * radius * radius; // A = pr*2
        double perimeter1 = 2 * 3.14 * radius; // C = 2pr
        System.out.println("Area of the square is " + area1 + "\n"+ "Perimeter of the circle is "
                + perimeter1);
        System.out.println("________________________________________________");

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federaltaxrate = 26;

        int salaryBeforeTax = 52 * hourlyRate*weeklyHours;// (52) weeks has 1 full year.
        double stateTax  = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federaltaxrate / 100;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salaryBeforeTax-stateTax-federalTax;

        System.out.println("Gross pay is:$" +salaryBeforeTax );
        System.out.println("Federal tax is:$"+federalTax);
        System.out.println("State tax is:$"+stateTax);
        System.out.println("Total tax is:$"+totalTax);
        System.out.println("Net income is:$"+salaryAfterTax);

        System.out.println("____________________________________________");

        int x = 10, y=20, z;
        z=x;
        x=y;
        y=z;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("________________________________________");

        int x1=10, y1=15;
        x=x-y;
        y=x+y;
        x=x-y;
        System.out.println("x="+ y1);
        System.out.println("y="+ x1);

















        }




    }

