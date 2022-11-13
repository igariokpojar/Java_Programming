package day34_abstraction.carTask;

import day34_abstraction.CarTask2.Toyota;
import day34_abstraction.animalTask.Cat;

public  abstract class Car { // meant to be inherited and the class be can not be instantiated

    private final String make, model;
    private String color;
    private final int year;
    private int price;

    public Car(String model, String color, int year, int price) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the car
        this.model = model;
        setColor(color);
        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }


    protected final void stop() { // to make sure that non-sub classes outside the package can not access it
        System.out.println("Press the brake to stop " + make + " " + model);
    }

    protected abstract void start(); // meant to be overridden


    @Override
    public String toString() {
        return make + "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            System.err.println(" Invalid Object: " + obj);
            System.exit(1);
        }
        Car car = (Car) obj; // upcasting and reassign to variable "car" and reuse it

        if (model.equals(car.getModel()) && make.equals(car.getMake()) && color.equals(car.getColor())) {
            return true;
        }
        return false;
    }
}






/*
Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

*/