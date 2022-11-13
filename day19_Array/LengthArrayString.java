package day19_Array;

public class LengthArrayString {
    public static void main(String[] args) {

                String[] array=new String[]{"Sai","Pavan","Babu"};  //create an array of Strings

                printLarger(array,3);   //call the method to print strings having length more than 3

            }

            public static void printLarger(String[] array, int len) //method implementation
            {
                for(String s:array) //for each String in array
                {
                    if(s.length()>len)  //if length of s is greater than len
                        System.out.println(s);  //print the String
                }
    }
}
/*
Use length() method available in String class to find the length of string and then compare this with the passed
parameter and print the string only if length is greater
 */