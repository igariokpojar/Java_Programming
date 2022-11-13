package day42_map;

import java.util.*;

public class EmployeeName_Salary {

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
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        int num = 0;

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() > max) {
                max = each.getValue();
            }
            if (each.getValue() < min) {
                min = each.getValue();
            }
            if (each.getValue() >= 120000 && each.getValue() <= 150000) {
                num++;
            }

        }
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue().equals(max)) {
                System.out.println(each.getKey() + " Has the highest salary this year " + "$" + each.getValue());
            }
            if (each.getValue().equals(min)) {
                System.out.println(each.getKey() + " Has the lowest salary this year");
                System.out.println(num + " people make between 120k~150k");
            }
        }
        System.out.println("______________________________________________________________");
        for (Map.Entry<String, Integer> names : map.entrySet()) {
            if (names.getValue()<118000){
                System.out.println(names);
            }

        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<120000){
                map.replace(entry.getKey(), entry.getValue()+10000);
            }

        }
        System.out.println(map);

        System.out.println("________________second method____________________");


    }
}
/*
 2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */