package src.day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber, groupNumber;
    public char grade;

    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber, char grade) {
        ;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    static{
        schoolName = "Cydeo School";
        programmingLanguage = "Java";
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
/*
 create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
