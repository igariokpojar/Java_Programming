package day4_concatination;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "May";
        String Fullname = "James May";
        String email = "jamesmay@gmail.com";
        String street = "Jones Branch Dr";
        String state = "VA";
        String city = "Mc Lean";
        String Address = "7925 Jones Branch Dr";
        long Contacts = 7896542314l;
        int age = 35;
        String zip_code = "22102";
        double height = 5.10;
        double weight = 173.2;
        boolean isMarried = true;
        long work_Phone_Number = 7896542314l;
        long personal_Number = 2406542314l;
        System.out.println("Patient personal information" + "\n" + "Full name" + ":" + " May, James" +
                "\n" + "Address" + ": " + "7925 Jones Branch Dr, McLean, VA " + "22102" +
                "\n" + "Contacts" + ":" + " work phone number " + "-" + " 7896542314, " +
                "personal phone number " + "-" + " 2406542314, " + "email:" + " jamesmay@gmail.com" +
                "\n" + "Age:" + " " + 35 + "\n" + "Height:" + " " + 5.1 +
                "\n" + "Weight:" + " " + 173.2 + " pounds" + "\n" + "Married?: " + true);
    }
}

        /*String name = "Daniel";
        int age = 28;
        String gender = "Male";
        String company_name = "Google Inc";
        String jobTitle = "Software Developer";
        int salary = 90000;

        System.out.println("\t" +name + "is" + " " + age + " years old," +
                " gender is" + " " + gender + ".");
        System.out.println("\t" +name + " works at" + " " + company_name + " as a"
                + " " + jobTitle + ".");
        System.out.println("\t" +name + " makes $" + " " + salary + " per year" + ".");


    }
}
/*
1. Create a class named EmployeeInfo.java
2. Declare the following Variables:
1. name
2. age
3. gender
4. company_name
5. jobTitle
6. salary
3. Use concatenation to display the full info of the employee:
Ex:
given data:
name = “Daniel”
age = 28
gender = “Male”
company_name = “Google Inc”
job_title = ”Software Developer"
salary = 90000
output:
Daniel is 28 years old, gender is Male.
Daniel works at Google Inc as a Software Developer.
Daniel makes $ 90000 per year.

 */