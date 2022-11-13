package day31_Inheritance.PersonTask;

public class GraduateStudent extends Student {


    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is studying");
    }
}




/*
GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary
 */