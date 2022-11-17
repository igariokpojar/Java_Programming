package day34_abstraction.CarTask2;

public class Audi extends Car implements AutoPark{
    public Audi(String make, String model, int year, double price, String color) {
        super( make,model, year, price, color);
    }

    @Override
    public void drive() {
        System.out.println("Driving "+getMake()+" "+getModel()+" on the road");
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" auto park mode is on");
    }
    }

