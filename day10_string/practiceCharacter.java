package day10_string;

public class practiceCharacter {
    public static void main(String[] args) {
        String s2 = "I love Chicago";
        char f = s2.charAt(0);
        int lastIndexNumber =s2.length()-1;
        char l = s2.charAt(lastIndexNumber);
        System.out.println(f +" : "+l);

        System.out.println("________________________________");
        String name  = "Alexandru";
        String name1 = new String("Alexandru");

        System.out.println(name== name1);
        System.out.println(name.equals(name1));

        System.out.println("____________________________________");
        String r1 = "Java";
        String r2 = "Java";
        String r3 = "java";
        String r4 = new String("Java");

        System.out.println(r1==r2);// false
        System.out.println(r1==r3);// false
        System.out.println(r3==r4);// false
        System.out.println(r1.equals(r4));




    }
}
