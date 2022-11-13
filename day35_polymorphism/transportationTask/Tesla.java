package day35_polymorphism.transportationTask;

public class Tesla extends Car implements AutoPark,AutoPilot,Electric{
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+getModel()+" is self parking");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+getModel()+" is self driving");

    }

    @Override
    public void charge() {
        System.out.println();

    }

    @Override
    public void transportPeople() {
        System.out.println();

    }

    @Override
    public void start() {
        System.out.println();

    }
}
/*
Create a subclass of Car named Tesla that implements AutoPark, AutoPilot and Electric
 */