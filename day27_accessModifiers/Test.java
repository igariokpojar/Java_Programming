package src.day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

        //new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("-----------Dog----------------------------------");

        Dog dog = new Dog("Lucy", "Husky", "Small", 'F',4, "White" );

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();

        System.out.println("___________Iphone_________________________________________");

        IPhone iPhone = new IPhone("iphone 12", "Black", 1000, "5.6 inches");

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);


        System.out.println("___________Person__________________________________________");

        Person person1 = new Person("Josh", 28, 'M');
        Person person2 = new Person("Breanna", 32, 'F');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);





    }

    }

