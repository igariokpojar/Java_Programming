package day38_exception;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1  = new Person("Alexandru",6,'M');

        System.out.println(person1);

        try {
           person1.setAge(-25);
       }catch (RuntimeException e){
           e.printStackTrace();
}

    }
}
