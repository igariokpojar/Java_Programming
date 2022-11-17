package day29_inheritance.EmployeeTask;


import day29_inheritance.EmployeeTask.Employee;

public class Tester extends Employee {

    public void isTesting(){
        System.out.println(getName() + "is testing");
    }



}
/*
1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 and 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement
 */