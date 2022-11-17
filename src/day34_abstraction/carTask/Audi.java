package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    public void autoPark(){
        System.out.println(getMake() +" "+getModel() +" has auto park feature");
    }
}
/*
 Create the following subclasses of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
 */