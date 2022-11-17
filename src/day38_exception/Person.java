package day38_exception;

public class Person {

    private String name;
    private  int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender == 'M' || gender == 'F')){ // if the gender is invalid
            throw new RuntimeException("Invalid gender: "+gender); // trows the runtime exception and crash the program
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age == 0){
            throw new RuntimeException("Age can not be set");
        }
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>150){ // if the given age is invalid
            throw new RuntimeException("Invalid age: "+age); // trow runtime exception, and crash program

        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
