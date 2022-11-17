package day11_string;

public class StringMethod2 {
    public static void main(String[] args) {
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        //----------------------------------------------------------

        String word = "java";

        // word = word.replace('a' , 'e');  //"jeve"

        word.replace("a", "e");

        System.out.println(word);

        //----------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        //----------------------------------------------------------

        String sentence3 = "Java is fun, Java  is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);

        //-----------------------------------------------------------------------;
        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow =  sentence7.substring( sentence7.lastIndexOf(" ") +1  );
        // create the substring "Monday" from sentence7. DO NOT count any index numbers

        System.out.println(tomorrow);
        //----------------------------------------------------------------------------;

        String str = "Python";

        String result = (str +"\n").repeat(10);

        System.out.println(result);
        //-------------------------------------------------------------------------------;








    }
}
