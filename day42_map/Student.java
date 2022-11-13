package day42_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {

        Map<String, int[]> student = new LinkedHashMap<>();
        student.put("Alexandru",new int[]{85});
        student.put("Alla",new int[]{90});
        student.put("Alexandra",new int[]{95});
        student.put("Igariok",new int[]{92});
        student.put("Meda",new int[]{100});

        for (Map.Entry<String, int[]> each : student.entrySet()) {
            System.out.println(each.getKey() + Arrays.toString(each.getValue()));

        }
        System.out.println("_____________________-second method___________________");

        Map<String, int[]> students= new LinkedHashMap<>();
        int[] scoresJohn = {95, 70, 87, 96, 88};
        int[] scoresSam = {70, 80, 84, 86, 90};
        int[] scoresMary = {95, 70, 97, 77, 81};
        int[] scoresEmma = {93, 90, 91, 87, 78};
        int[] scoresMark = {96, 87, 84, 86, 88};

        students.put("John", scoresJohn);
        students.put("Sam", scoresSam);
        students.put("Mary", scoresMary);
        students.put("Emma", scoresEmma);
        students.put("Mark", scoresMark);

        for(Map.Entry<String, int[]> each : students.entrySet()){
            System.out.println(each.getKey() + " : " + Arrays.toString(each.getValue()));
        }


    }
}
/*
 Create a map that can contain the student name (String) and student scores (int[]) as a pair
  (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 paris into the map
		1.2 Write a program that can display each student name and scores
 */