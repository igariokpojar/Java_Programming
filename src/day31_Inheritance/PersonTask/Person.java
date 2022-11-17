package day31_Inheritance.PersonTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        if (name==null){
            System.out.println("Unknown");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Invalid! name should not be empty");
            System.exit(1);
        }
        for(char each : name.toCharArray()){
            if (!Character.isLetter(each) && !name.contains(" ")){
                System.err.println("Invalid name " + name);
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
 Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor that can set all the fields

                    Condition:
                        1. name should not be set to null
                        2. name should not be empty
                        3. name should not contain any special character other than space
                        4. age should not be set to negative
                        5. gender must be valid

            Methods:
                eat()
                drink()
                sleep()
                toString()

 */