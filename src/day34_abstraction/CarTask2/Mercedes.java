package day34_abstraction.CarTask2;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("The auto park engaged");

    }

    @Override
    public void start() {
        System.out.println("Press the break pedal and push the button to start "+ getModel());

    }

    @Override
    public void drive() {
        System.out.println("You are driving " + getModel());
    }
    public String toString() {
        return super.toString().replace("}","") + ", hasAutoPark=" + hasAutoPark + "}";
    }
}
