package day42_map;

import java.util.*;


public class Student2 {

    public static void main(String[] args) {
        String[] group1 = {"Adili","Alena","Baktiyar"};
        String[] group2 = {"Baturay","Diana","Entisar"};
        String[] group3 = {"Esmira","Ermek","Flora"};
        String[] group4 = {"Igariok","Alexandru","Alla"};
        String[] group5 = {"Ionica","Catalina","Adelina"};


        Map<Integer, String[]> groups = new LinkedHashMap();
        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(3,group3);
        groups.put(4,group4);
        groups.put(5,group5);

        System.out.println(Arrays.toString(groups.get(1)));

        System.out.println("__________________________________________");

        for (Map.Entry<Integer, String[]> each : groups.entrySet()) {
            System.out.println(each.getKey()+" "+Arrays.toString(each.getValue()));
        }

    }
}
/*
 Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups
 */