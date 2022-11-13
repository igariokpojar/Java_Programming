package day42_map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //Max and min value
        int maxValue = Collections.max(map.values());
        int minValue = Collections.min(map.values());

        System.out.println("Max salary : " + maxValue + "\nMin salary: " + minValue);

        System.out.println("-----------------------------------------------------");

        //count salary
        int countEmployees = 0;
        for(Integer each : map.values()){
            if(each >= 120000 && each<= 150000){
                countEmployees++;
            }
        }
        System.out.println(countEmployees);

        System.out.println("-----------------------------------------------------");

        //display names
        for(String names : map.keySet()){
            if(map.get(names) < 118000){
                System.out.println(names);
            }
        }
        System.out.println("-----------------------------------------------------");

        //increase salary
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() < 120000){
                map.replace(entry.getKey(), (Integer)entry.getValue() + 10000);
            }
        }
        System.out.println(map);
    }
}
