package day30_inheritance.Device;

public class Device {

    private String brand, model, size, color;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        if(brand == null){
            brand = "Unknown";
        }
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.isEmpty()){
            System.err.println("Invalid input " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price " + price);
            System.exit(1);
        }
        this.price = price;
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

    public void turnOn(){
        System.out.println(brand + " " + model + " turning on");
    }

    public void turnOff(){
        System.out.println(brand + " " + model + " turning off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
1. Create a class named Device
			Variables:
				brand, model, color, size, price
				hasBattery, hasPowerButton

			Encapsulate all the fields
					Conditions:
						1. brand, model can not be null (
						2. brand, model can not be empty or blank
						3. price can not be zero or negative

			Methods
				turnOn()
				turnOff()
				toString()
 */