package day31_Inheritance.Animal_methodOverriding;

public class Eagle extends Animal{

    public Eagle(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + "is eating snake");
    }
}
