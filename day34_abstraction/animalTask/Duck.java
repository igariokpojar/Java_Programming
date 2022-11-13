package day34_abstraction.animalTask;

public class Duck extends Animal implements Playable,Flyable,Swimable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+ getName() +" is eating worm");
    }

    @Override
    public void play() {
        System.out.println("Duck" +getName()+" is playing");
    }

    @Override
    public void fly() {
        System.out.println("Duck " +getName() +" is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck" +getName()+" is swimming");
    }
}
