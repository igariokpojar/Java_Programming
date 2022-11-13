package day30_inheritance.Device;

public class Desktop extends Computer{

    public Desktop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, int memory, int RAM, boolean hasSSD) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, memory, RAM, hasSSD);
    }
}
