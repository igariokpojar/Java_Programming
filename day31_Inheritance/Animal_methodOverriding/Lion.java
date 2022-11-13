package day31_Inheritance.Animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public Lion(String name, String breed, String color, String size, char gender, int age, boolean isAfricanLion) {
        super(name, breed, color, size, gender, age);
        setAfricanLion(isAfricanLion);
    }

    public void eat(){
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar(){
        System.out.println("Lion " + getName() + " is roaring");
    }

    // second to String method
    /*
    public String toString() {
         return  super.toString().replace("}", "") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    */

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" +getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", gender=" + getGender() +
                ", age=" +getAge() +
                ", Africa Lion='" + isAfricanLion + '\'' +
                '}';


    }
    }

