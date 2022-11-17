package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;

public  abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    public void land(){
        System.out.println("Plane "+getMake()+getModel());
    }

    @Override
    public void fly() {
        System.out.println(getMake()+getModel()+" is flying");
    }
}
/*
Create an abstract subclass of Transportation named Plane that implements Flyable

				non-abstract method:
					land()

 */