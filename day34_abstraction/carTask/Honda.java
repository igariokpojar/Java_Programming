package day34_abstraction.carTask;

public class Honda extends Car {


    public Honda(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start " + getMake() + getModel());
    }

}
