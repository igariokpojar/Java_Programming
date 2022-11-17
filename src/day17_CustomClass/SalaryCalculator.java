package day17_CustomClass;

public class SalaryCalculator {
    public int hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public  int weeklyHours;

    public void setInfo(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary =  hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax(){
        double stateTax = salary() * stateTaxRate/100;
        return stateTax;
    }
    public double federalTax(){
        double federalTax =  salary() * federalTaxRate/100;
        return federalTax;
    }
    public double salaryAfterTax(){
        double salaryAfterTax = salary() - stateTax() - federalTax();
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary is: " + salary() +
                ", state tax: " + stateTax() +
                ", federal tax: " + federalTax() +
                ", salary after tax: " + salaryAfterTax() +
                '}';


    }

}
