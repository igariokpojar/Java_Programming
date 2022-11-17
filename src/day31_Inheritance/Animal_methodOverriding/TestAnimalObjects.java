package day31_Inheritance.Animal_methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bangle", "Grey", "Small", 'F', 6);

        Dog dog = new Dog("Max", "Husky", "White", "Large", 'M', 4);

        Lion lion = new Lion("Simba", "African Lion", "Yellow", "Large", 'M',6, true);

        Eagle eagle = new Eagle("Bella", "American Eagle", "Black", "Medium" ,'F', 4);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("--------------------------------------------------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println("----------------------------------------------------------");


        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();

    }
}
