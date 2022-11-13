package day31_Inheritance.PersonTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person {

    private String studentId,fieldOfStudy,grade,schoolName;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty()){
            System.out.println("Invalid student Id");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty()) {
            System.out.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","D","F"));
        if(!list.contains(grade)) {
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty()) {
            System.out.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " Is studying");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
 Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
 */