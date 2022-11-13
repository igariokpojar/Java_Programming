package day18_GarbageColection;




class Car{

    public String brand;
    public String model;
    public String color;
    public int year;

}


public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // stack

        Car car   =  new Car();
        //  stack      heap





        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;




    }


    public static void method1(){

        int b = 200; // stack

    }


    public static void method2(){

        String  c  =  "Hello World";
        //    stack       heap (String Pool)

        String  d   =  new String("Hello World") ;
        //     stack         heap
    }



}