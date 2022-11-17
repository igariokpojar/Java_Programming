package day30_inheritance.Device;

public class TV extends Device{

    public TV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
    public void channelUp(){
        System.out.println(getBrand() + " channels up");
    }
    public void channelsDown(){
        System.out.println(getBrand() + "channels down");
    }
}
