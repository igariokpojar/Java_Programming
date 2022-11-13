package day30_inheritance.Device;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton, int memory, int RAM, boolean hasSSD) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, memory, RAM, hasSSD);
    }
}
