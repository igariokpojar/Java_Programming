package day17_CustomClass;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercedes","GLE",2022,"Black",12000);

        Car car2 = new Car();
        car2.setInfo("Lexus","Rx450H",2022,"DeepBlue",78000);

        Car car3 = new Car();
        car3.setInfo("Tesla","Y",2022,"Black",67000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car3.availability();


    }
}
