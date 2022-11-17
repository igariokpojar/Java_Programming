package interview;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Igor Pojar Alexandru";
        //             012345678910...

        char ch = name.charAt(8);
        System.out.println(ch);

        System.out.println(name.length());

        char lastChar = name.charAt(name.length()-1); // important formula
        System.out.println(lastChar);

        System.out.println("________indexOf________________________________________________");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');

        System.out.println(index1);

        int index2 = school.indexOf('j');// not exist so is print -1 in the console
        System.out.println(index2);

        String str1  ="Java Programming Language";
        int index3 = str1.indexOf("va")+1;// or ("a ") cu space
        System.out.println(index3);

        System.out.println("______to lower case or to upercase___________________________________________________________");


        String s1 = "WOODEN SPOON";

        s1=s1.toLowerCase();// "wooden spoon"

        System.out.println(s1);

        s1=s1.toUpperCase(); // "WOODEN SPOON"
        System.out.println(s1);


        System.out.println("____replace methode______________________________________________________");

        String sentence = "Today is Thursday and Thursday is lab day";
        sentence = sentence.replace("Thursday","Friday");
        System.out.println(sentence);




        System.out.println("__________________substring method________________________________________________________");


        String email = "cydeo_school@gmail.com";

        int beginningIndex = email.indexOf('@')+1;
        int endingIndex = email.lastIndexOf('.');// is checking  the character from right to left.

        String domain = email.substring(beginningIndex,endingIndex);

        System.out.println(domain);


        System.out.println("______substring__second methode_________________________________________________________________________");

        String s2 = " I study at CYDEO school";

        String schoolName = s2.substring(s2.indexOf('C'));

        System.out.println(schoolName);


        System.out.println("__________________equal method_/ equal Ignore case______________________________________________________________________________________");

        String a1 = "DOG";
        String a2 = "dog";

        System.out.println(a1.equals((a2)));
        System.out.println(a1.equalsIgnoreCase(a2));


        System.out.println("____________________contains method_____________________________________________");

        String s3 = "Java is my favorite programming language";

        System.out.println(s3.contains("Java"));


        System.out.println("________________________________startWith methode__________________________________");

        String w = "Cydeo School";
        System.out.println(w.startsWith("C"));// in the end we got true or false     boolean expression

        System.out.println(w.endsWith("ool"));


    }
}
