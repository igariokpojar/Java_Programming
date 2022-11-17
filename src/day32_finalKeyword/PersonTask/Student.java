package day32_finalKeyword.PersonTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public final class Student extends Person {

    private String studentId,fieldOfStudy,grade,schoolName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, char gender, LocalDate dateOfBirth, String studentId, String fieldOfStudy, String grade, String schoolName) {
        super(name, gender, dateOfBirth);

        if (studentId == null || studentId.isEmpty()){
            System.out.println("Invalid student Id");
            System.exit(1);
        }
        this.studentId = studentId;

        if (fieldOfStudy == null || fieldOfStudy.isEmpty()) {
            System.out.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","D","F"));
        if(!list.contains(grade)) {
            System.err.println("Invalid grade: " + grade);
            System.exit(1);
        }
        this.grade = grade;

        if (schoolName == null || schoolName.isEmpty()) {
            System.out.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;


    }
    public void study(){
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" +getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
