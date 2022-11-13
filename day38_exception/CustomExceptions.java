package day38_exception;

class CustomCheckException extends Exception{


}

class CustomUncheckException extends RuntimeException{


}

public class CustomExceptions {

    public static void main(String[] args)  {
        try {
            throw new CustomCheckException();
        }catch (CustomCheckException e){
            e.printStackTrace();
        }
        System.out.println("_____________________________________");

        throw new CustomUncheckException();

    }
}
