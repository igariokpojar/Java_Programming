package interview;

import java.util.Scanner;

public class getDuplicates {

    public static class Main {
        public static int getDup(String[] r){
            int n = r.length;// length of the array
            int dup = 0;// initialize the duplicate count to 0
            //traverse through the array
            for(int i=0;i<n;i++){
                //for each element at i, traverse through the array again and check if there's another element equal to it, increment dup if there is element equal to it
                //NOTE: if first duplicate element is found, then dup should be incremented by 2, because the first duplicate element is at i and the second duplicate element is at j
                //Using flag to check if duplicate is found or not
                boolean flag = false;
                for(int j=0;j<n;j++){
                    //if the value is equal to the element at j, increment dup
                    //NOTE: elements should be on different index
                    if(r[i]!=null && r[i].equals(r[j]) && i!=j){
                        //IF the element is first duplicate element, then increment dup by 2, counting original element and duplicate element
                        if(flag==false){
                            dup+=2;
                            flag = true; //set the flag to true
                        }
                        else{
                            dup++; //increment dup by 1, counting duplicate element
                        }

                        r[j] = null; //set the element at j to null so that it's not counted again
                    }
                }
            }
            return dup;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in); //input stream to read user input

            String[] strs = new String[in.nextInt()]; //create an array of strings of size n entered by user
            //Read the values from user and store in the array
            for (int i = 0; i < strs.length; i++) {
                strs[i] = in.next(); //read values to array
            }

            System.out.println(getDup(strs)); //print the number of duplicate strings in the array
        }
    }
}
