package day17_CustomClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color = "White";
        dog1.gender = 'F';

        Dog dog2 = new Dog();
        dog2.name = "Max";
        dog2.breed = "german Shepherd";
        dog2.size = "Small";
        dog2.age = 1;
        dog2.color = "Black";
        dog2.gender = 'M';

        Dog dog3 = new Dog();
       dog3.setInfo("Loki","Husky",'M',5,"small","White");

       Dog dog4 = new Dog();
       dog4.setInfo("Chuck","Bulldog",'M',5,"small","Black");

        System.out.println( dog1);
        System.out.println( dog2);
        System.out.println( dog3);
        System.out.println( dog4);


        dog3.eat();
        dog1.play();
        dog2.drink();



    }
}
