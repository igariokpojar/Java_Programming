package day34_abstraction.CarTask2;

public abstract class Car {

    private final String make,model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make==null || make.isEmpty()){
            System.out.println(make +" can not be null or empty");
        }
        this.make = make;
        if (model==null || model.isEmpty()) {
            System.out.println(model + " can not be null or empty");
        }
        this.model = model;
        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isEmpty()) {
            System.out.println(color + " invalid color");
        }
        this.color = color;
    }
    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(getMake()+" "+getModel()+" is stop");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                " model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */