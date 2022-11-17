package day31_Inheritance.Animal_methodOverriding;

public class Dog  extends Animal{

    public Dog(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");
    }
    public void bark(){
        System.out.println("Dog " + getName() + " is braking");
    }
}
