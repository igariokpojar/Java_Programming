package day17_CustomClass;

public class Dog {

    public String name;

    public char gender
            ;
    public String breed;

    public String size;

    public int age;

    public String color;

                       // "Max"       "Husky"          'M'       5          "small      "White"

    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name; // this keyword is use for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age  = age;
        this.size = size;
        this.color = color;

    }// this methode can help us to set all the information of the dog at ones.

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void play(){
        System.out.println(name+ " is playing ");}

    public String toString() {// to avoid getting hash-codes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}







