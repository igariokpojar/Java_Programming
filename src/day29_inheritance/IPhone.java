package day29_inheritance;

public class IPhone extends PhoneClass {

    public void faceTime(long number){
        System.out.println("FaceTime " + number);
    }
    public void faceTime(String email){
        System.out.println("Face Time " + email);
    }

}
