package src.day26_statics;

public class CydeoStudents {

    public String name,id;
    public int age, grade, batchNumber,groupNumber;;
    public char gender;
    public static String schoolName = "Cydeo";
    public static String Language = "Java";


    public CydeoStudents(String name, int batchNumber,int age,char gender, String id,int groupNumber,char grade){
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.gender  =gender;
        this.id  =id;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying Java");
    }

    public void attendClass(){
        System.out.println( name + " is attending class");
    }

    public void printSchoolName(){
        System.out.println("School name " + schoolName);
    }

    public void printLanguage(){
        System.out.println("Learning " + Language );
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }
}


/*
 CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */