package day31_Inheritance.PersonTask;

public class Employee {

    private String name,id,jobTitle,companyName;
    private double salary;
    private int age;
    private char gender;

    public Employee(String name, String id, String jobTitle, String companyName, double salary, int age, char gender) {
        setName(name);
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
        setAge(age);
        setGender(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender " + gender);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 18){
            System.err.println("Invalid age " + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Invalid salary " + salary);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
 Create a class named Employee
            Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()
 */