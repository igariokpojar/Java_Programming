package interview;

public class FindUniqueCharacter {
    public static void main(String[] args) {
        //the shortest approach with one for loop, for this interview question
        String str1 = "aabcccd";

        String unique1 = "";

        for (int i = 0; i < str1.length(); i++) {//i: index number of the str
            char each = str1.charAt(i);

            if (str1.indexOf(each) == str1.lastIndexOf(each)){
                unique1 += each;
            }
        }
        System.out.println(unique1);//bd

        //The best or universal approach for finding unique character will be nested loop -- this approach is very important for interview

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {// checks how many times the ch variable has appeared in str
                if (str.charAt(i) == ch ){//if the ch has appeared in the string
                    frequency++;// increase the frequency by 1
                }
            }
            if (frequency == 1){// if the frequency is equal to one, then the character is unique.
                unique += ch;
            }

        }
        System.out.println(unique);

       /* char ch = str.charAt(0);//we have to manually change the character to 0,1,2,3....to check whether each character is unique or not.
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {// checks how many times the ch variable has appeared in str
            if (str.charAt(i) == ch ){//if the ch has appeared in the string
                frequency++;// increase the frequency by 1
            }
        }
        if (frequency == 1){// if the frequency is equal to one, then the character is unique.
            unique += ch;
        }

        */
    }
}
