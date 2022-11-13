package day7IfStatement._IfStatement;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int income = 250000;
        int netIncome = 0;
        boolean married = true;
        int tax35 = income*35/100;
        int tax30 = income*30/100;
        int tax25 = income*25/100;
        int tax20 = income*20/100;
        int marriageTax = income*5/100;
        if (income>=130000){netIncome = income-tax35;}
        if (income>=100000 && income<=129000){netIncome = income-tax30;}
        if (income>=80000 &&income <=99000){netIncome = income- tax25;}
        if (income<=79000){netIncome = income- tax20;}

        System.out.println("netIncome = " + netIncome);








    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax
 based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax.
 */