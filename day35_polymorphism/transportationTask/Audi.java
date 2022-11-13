package day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPark {

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+getModel()+" is self parking");

    }

    @Override
    public void transportPeople() {
        System.out.println(getMake()+getModel()+" is transport people");

    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+" is starting");

    }
}
/*
Create a subclass of car named Audi that implements AutoPark
 */