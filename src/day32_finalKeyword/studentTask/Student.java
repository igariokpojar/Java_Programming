package day32_finalKeyword.studentTask;

public class Student extends Person {

    private String studentID, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null || fieldOfStudy.isEmpty()){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName == null || fieldOfStudy.isEmpty()){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying.");
    }

    public String toString() {
        return "Student{" +
                super.toString().replace("}", "") +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }


}
/*
 2. Create a subclass of Person named Student:
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
