package day31_Inheritance.Animal_methodOverriding;

public class Cat extends Animal{


    public Cat(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }


    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");
    }


    public void sleep() {
        System.out.println("Cat " + getName() + " is sleeps 12 hours in a day");
    }

    public void scratch(){
        System.out.println("Cat "+ getName() + " is scratching");
    }
}
