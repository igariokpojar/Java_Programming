package day34_abstraction.deviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps{


    public static boolean hasApplePay = true;

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public static boolean isHasApplePay() {
        return hasApplePay;
    }

    public static void setHasApplePay(boolean hasApplePay) {
        Iphone.hasApplePay = hasApplePay;
    }

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }

    @Override
    public void downloadApp() {
        System.err.println("Create an Apple Id for "+appStoreName+" to downloads apps");

    }

    @Override
    public void turnOn() {
        System.out.println("Press and hold the power button "+getBrand()+" to turn on"+getModel());
    }

    @Override
    public void turnOf() {
        System.out.println("Press and hold the power button "+getBrand()+" to turn off"+getModel());
    }


}
