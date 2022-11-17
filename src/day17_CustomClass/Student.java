package day17_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public String studentId;
    public char grade;
    public boolean isFullTime;


    public void setInfo(String name,char gender,int age,String studentId,char grade,boolean isFullTime){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime=isFullTime;
    }

    public void study() {
        System.out.println(name+" is student");
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
