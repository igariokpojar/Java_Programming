package day17_CustomClass;

public class StudentObject {
    public static void main(String[] args) {

        Student student1  = new Student();
        student1.setInfo("Alexandru",'M',22,"A456",'A',true);

        Student student2 = new Student();
        student2.setInfo("Alla",'F',30,"A146",'A',false);

        Student student3 = new Student();
        student3.setInfo("Igor",'M',39,"A789",'A',true);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student2.study();
    }
}
