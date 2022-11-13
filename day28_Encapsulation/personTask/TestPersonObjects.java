package src.day28_Encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Igariok");

        Person person2 = new Person("Alexandru",'M');

        Person person3 = new Person("Alla",32);

        Person person4  = new Person("Alexandra","Romanian");

        Person person5  = new Person("Maria",65,'F');

        Person person6 = new Person("Adelina",9,'F',"French");

        person5.name  = "Daniel"; // we can change for instance

       // Person.planet = "Mars"; // we can change for static

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat(" Placinte");

        person3.drink(" Jin de casa");


    }
}
