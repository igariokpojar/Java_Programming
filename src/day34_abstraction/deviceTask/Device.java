package day34_abstraction.deviceTask;

public  abstract class  Device {

    private final String brand,model;
    private double price;
    private String color;
    private final String size;

    boolean hasBattery,hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {

        if (brand==null || brand.isEmpty()){
            System.err.println("Error");
        }
        this.brand = brand;
        if (model==null || model.isEmpty()) {
            System.err.println("Error");
        }
        this.model = model;
        setPrice(price);
        if (size==null || size.isEmpty()) {
            System.err.println("Error");
        }
        this.size = size;
        setColor(color);
        setHasPowerButton(hasPowerButton);
        setHasBattery(hasBattery);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println(" Invalid price ");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isEmpty()) {
            System.err.println("Error");
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getSize() {
        return size;
    }
    public abstract void turnOn();
    public abstract void turnOf();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */