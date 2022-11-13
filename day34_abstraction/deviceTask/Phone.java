package day34_abstraction.deviceTask;

public class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOf() {

    }
    public void call(long phoneNum){
        System.out.println("Calling "+ phoneNum+" from" + getModel() + getBrand());
    }
    public void text(long phoneNum){
        System.out.println("Texting "+ phoneNum+" from" +getModel()+ getBrand());;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + getBrand() + '\'' +
                ", model='" +getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                "hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */