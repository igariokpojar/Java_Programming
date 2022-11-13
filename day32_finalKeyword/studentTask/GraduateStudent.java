package day32_finalKeyword.studentTask;

public class GraduateStudent  extends Student{

    public GraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentID, fieldOfStudy, schoolName, grade);
    }


    @Override
    public void study() {
        System.out.println(getName() +" studies as a graduate student");
    }
}
