package day31_Inheritance.PersonTask;

public class CydeoStudent  extends Student{

    private String programmingLanguage;
    private int bachNumber,groupNumber;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String grade, String schoolName, String programmingLanguage, int bachNumber, int groupNumber) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setProgrammingLanguage(programmingLanguage);
        setBachNumber(bachNumber);
        setGroupNumber(groupNumber);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.isEmpty()) {
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getBachNumber() {
        return bachNumber;
    }

    public void setBachNumber(int bachNumber) {
        if (bachNumber <= 0)
            System.err.println("Invalid bach number " + bachNumber);
        System.exit(1);

        this.bachNumber = bachNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0)
            System.err.println("Invalid group number " + groupNumber);
        System.exit(1);
        this.groupNumber = groupNumber;
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " eats placinte");
    }

    @Override
    public void drink() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " drinks  compot");;
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " sleeps more than 8 hours");
    }

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", bachNumber=" + bachNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included
 */