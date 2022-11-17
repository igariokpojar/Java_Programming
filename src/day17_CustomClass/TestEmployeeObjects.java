package day17_CustomClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Igor",38,'M',"Java Developer",
                12000,
                "A132");
        Employee employee2 = new Employee();
        employee2.setInfo("Alla",30,'F',"Amazon Developer",15000,"B132");


        Employee employee3 = new Employee();
        employee3.setInfo("Alexandru",6,'M'," Engineer Software at Microsoft",200000,"C132");


        employee1.age = 39;


        System.out.println( employee1);
        System.out.println(employee2);
        System.out.println(employee3);


        employee1.work();



    }


}



