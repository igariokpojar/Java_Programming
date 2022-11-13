package day34_abstraction;

import day34_abstraction.animalTask.Flyable;

public class Airplane  implements Flyable {
    @Override
    public void fly(){
        System.out.println(getClass().getSimpleName()+" is flying");

    }
}
