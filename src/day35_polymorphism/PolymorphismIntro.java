package day35_polymorphism;

import day26_statics.Circle;
import day32_finalKeyword.carTask_methodOverriding.Honda;
import day34_abstraction.animalTask.*;
import day34_abstraction.deviceTask.Device;

public class PolymorphismIntro {

    public static void main(String[] args) {

       Dog dog=  new Dog("Ciuc","Moldovenesc",'M',2,"M","White");
       Cat cat= new Cat("Mita","Moldovenesc",'F',1,"S","Black");

       Animal[]animals = {dog,cat};

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.drink();
        animal.eat();



    }
}
