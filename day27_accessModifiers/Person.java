package src.day27_accessModifiers;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman;
    public static boolean hasNose;
    public static boolean canBreath;
    public static int numberOfHead;
    public static int numberOfEyes;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        isHuman = true;
        hasNose = true;
        canBreath = true;
        numberOfHead = 1;
        numberOfEyes = 2;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
/*
 Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */
