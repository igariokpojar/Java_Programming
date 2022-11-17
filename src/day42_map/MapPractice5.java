package day42_map;

import java.util.*;

public class MapPractice5 {

    public static void main(String[] args) {


        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");

        map.forEach( (k, v) -> { System.out.println(k +" : "+ v); } );

    }
}
