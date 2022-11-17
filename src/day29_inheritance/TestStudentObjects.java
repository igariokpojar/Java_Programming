package day29_inheritance;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Alexandru",6,'M','A',"Cambridge");
        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setName("Igariok");
        student1.setAge(39);
        student1.setGrade('B');
        System.out.println(student1);
    }
}
