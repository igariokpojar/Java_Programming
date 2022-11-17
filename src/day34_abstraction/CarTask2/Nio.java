package day34_abstraction.CarTask2;

public class Nio extends  Car implements AutoPark,AutoPilot{

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("The auto park engaged");

    }

    @Override
    public void selfDriving() {
        System.out.println("The auto drive engaged");

    }

    @Override
    public void start() {
        System.out.println("Say start to start the " + getMake()+" "+getModel());

    }

    @Override
    public void drive() {
        System.out.println("You are driving " + getModel());

    }
    public String toString() {
        return super.toString().replace("}","") +
                ", hasAutoPark=" + hasAutoPark +
                ", hasAutoPilot=" + hasAutoPilot+
                "}";
    }
}
