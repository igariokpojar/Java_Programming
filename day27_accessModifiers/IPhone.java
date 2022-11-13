package src.day27_accessModifiers;

public class IPhone {

    public String model, color;
    public double price;
    public String size;

    public static String brand , OS  , madeIn ;

    public IPhone(String model, String color, double price, String size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    static{
        brand = "Apple";
        OS = "iOS";
        madeIn = "China";
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with  number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model+" is face timing with email "+email);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

}
/*
    Create a class named Iphone
        variables:
        brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn
        Add a constructor to initialized all the fields
        Add a static block to initialize all the statics
        Methods:
        printOperatingSystem(): displays the operating system of the iphone
        call(long phoneNumber)
        text(long phoneNumber)
        faceTime(long phoneNumber)
        faceTime(String email)
        toString()
*/