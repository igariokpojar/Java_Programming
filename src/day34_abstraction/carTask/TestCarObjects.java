package day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);
        Honda honda2 = new Honda("Pilot", "Black", 2019, 35000);
        Audi audi = new Audi("Q6", "Silver", 2020, 36000);
        Audi audi2 = new Audi("Q6", "Black", 2020, 36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(honda.equals(honda2));
        System.out.println(audi.equals(audi2));

        System.out.println("--------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();
        honda.equals(audi);

        System.out.println("--------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("--------------------------------------------");

        tesla.autoPilot();


    }
}
