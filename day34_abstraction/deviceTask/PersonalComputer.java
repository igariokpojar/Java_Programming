package day34_abstraction.deviceTask;

public class PersonalComputer extends Computer{


    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, String madeIn, String operationSystem) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, madeIn, operationSystem);
    }

    @Override
    public void turnOn() {
        System.out.println("Navigate to Start Icon"+getBrand()+getModel()+" select power button");
    }

    @Override
    public void turnOf() {
        System.out.println("Navigate to Start Icon"+getBrand()+getModel()+" select power button");
    }
}
