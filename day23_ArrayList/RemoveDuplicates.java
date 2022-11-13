package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");


        System.out.println("names = " + names);


        ArrayList<String> nonDup = new ArrayList<>();

        for (String each : names) {

            if(nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);

        }

        names = nonDup;

        System.out.println(names);

    }
}
