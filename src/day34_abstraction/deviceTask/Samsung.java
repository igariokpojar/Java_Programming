package day34_abstraction.deviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{


    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void freeze(){
        System.out.println(getBrand() +" "+ getModel() +" freezes a lot");
    }

    @Override
    public void downloadApp() {
        System.out.println("To download the apps for "+getModel()+getBrand()+" create a Google account and access to"+appStoreName);

    }
}
