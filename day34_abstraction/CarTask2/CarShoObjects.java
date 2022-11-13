package day34_abstraction.CarTask2;

public class CarShoObjects {

    public static void main(String[] args) {

      Audi audi = new Audi("Audi","Q8",2022,168000,"Black");
      BMW bmw = new BMW("BMW",2021,86000,"Grey");

        System.out.println(audi);
        System.out.println(bmw);

        audi.start();
        bmw.drive();
        audi.drive();
        bmw.start();
        audi.autoPark();

    }
}
