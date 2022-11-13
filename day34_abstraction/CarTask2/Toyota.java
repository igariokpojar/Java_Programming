package day34_abstraction.CarTask2;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start " + getMake() + getModel());

    }

    @Override
    public void drive() {
        System.out.println("You are driving "+ getModel() + getMake());

    }
}
