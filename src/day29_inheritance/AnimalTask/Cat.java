package day29_inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
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

    public void meow(){
       System.out.println(getName() + " is meowing");
   }
   public void scratch(){
       System.out.println(getName() +" is scratching");

   }
}
