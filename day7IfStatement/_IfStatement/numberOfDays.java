package day7IfStatement._IfStatement;

public class numberOfDays {
    public static void main(String[] args) {
int numb = 4;
boolean day28 = numb==2;// if the months is 2 (Feb), then it has 28 days
boolean day30 = numb==4 || numb==6 || numb==9 ||numb==11;
boolean day31 = !day28 && !day30;
String result = "";

if (day28){
    result = "28 days";}
    if (day30){
        result = "30 days";}
        if (day31){
            result = "31 days";}
            System.out.println(result);}
        }

/*
An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days:
 */