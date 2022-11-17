package day29_inheritance.AnimalTask;

public class Dog extends Animal {
    //      Child        Parent

    public Dog(String name, String breed, char gender, int age, String size, String color) {
       super(name, breed, gender, age, size, color);
    }



    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking");

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");

    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

}
