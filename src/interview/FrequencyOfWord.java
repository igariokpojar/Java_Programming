package interview;

public class FrequencyOfWord {
    public static void main(String[] args) {
        //1st approach
        String sentence = "java JAVA jAvA JAva";
        String word = "java";
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)){ // repeat only if contains the word "java"
            count++;
            sentence = sentence.replaceFirst(word, "");//
        }

        System.out.println(count);

        //2nd approach
        String sentence2 = "Java Java Java Java Python C# Ruby";
        String temp = sentence2.replace("Java","aaa");
        int totalNumberOfJava = sentence2.length() - temp.length();

        System.out.println(totalNumberOfJava);//4

        //3rd approach with substring

        String sentence1 = "Java Java Java Java Python C# Ruby Java Java java";

        int countJava = 0;
        // (int i = 0; i < sentence.length(); i++)
        for (int i = 0; i <= sentence.length()-4; i++) {
            String each = sentence.substring(i, i + 4);//creat all possible substring with four characters

            if (each.equalsIgnoreCase("Java")){
                countJava++;
            }
        }
        System.out.println(countJava);

        System.out.println("--------------------------------------------------------------------");

        String s = "Cat Cat Cat Dog Dog Dog dog dog dog";

        int countCat = 0;

        for (int i = 0; i <= s.length()-3; i++) {
            String each = s.substring(i, i + 3);//creat all possible substring with four characters

            if (each.equalsIgnoreCase("Cat")){
                countCat++;
            }
        }
        System.out.println(countCat);

        s = s.toLowerCase();
        int countDog = 0;

        for (int i = 0; i <= s.length()-3; i++) {
            String each = s.substring(i, i + 3);//creat all possible substring with four characters

            if (each.equals("dog")){
                countDog++;
            }
        }
        System.out.println(countDog);
    }
}
