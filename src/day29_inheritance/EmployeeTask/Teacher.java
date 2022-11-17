package day29_inheritance.EmployeeTask;

import day29_inheritance.EmployeeTask.Employee;

public class Teacher  extends Employee {

    public void teaching(){
        System.out.println(getName() + "is teaching");
    }
}
/*
 Create a custom Class named Teacher
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
				teching()
				toString(): prints teacher object info when the object is passed in the print statement
 */