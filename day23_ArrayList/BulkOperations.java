package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers);

        System.out.println(list1);

        System.out.println("-------addAllMethod-for any Collection---------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll( Arrays.asList(75, 85, 95, 70, 80) );

        System.out.println(scores);

        System.out.println("--------addAllMethod with String---------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Alexandru", "Alla", "Igariok", "Meda" )   );

        System.out.println(students);

        students.addAll(2,  Arrays.asList("Adelina", "Vit"," Bogdan") );

        System.out.println(students);


        System.out.println("--------Covert Array Elements to Array List---------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums) );

        //    l1.addAll(  Arrays.asList(nums) );

        System.out.println(l1);

        System.out.println("-------contains method----------------------------------");

        // verify all the elements that contains in the list

        ArrayList<String> employeesList = new ArrayList<>( Arrays.asList(  "Vladimir", "Alexandru", "Slava", "Maria" ));
       // employeesList.addAll( Arrays.asList(  "Vladimir", "Alexandru", "Slava", "Maria" )  );

        System.out.println(employeesList);

        boolean hasAlexandru = employeesList.contains("Alexandru");

        boolean hasAllaIgor = employeesList.containsAll( Arrays.asList("Igariok", "Alla") );

        boolean hasBogAlexCat = employeesList.containsAll( Arrays.asList("Bogdan", "Alexandru", "Catalina") );

        System.out.println("hasAlexandru = " + hasAlexandru);
        System.out.println("hasAllaIgor = " + hasAllaIgor);
        System.out.println("hasBogAlexCat = " + hasBogAlexCat);


        System.out.println("------------------remove all method-(Accept collection type only,,,,, asList)---------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20) );

        list.removeAll( Arrays.asList(10, 20) ); // remove all 10 and 20 from list

        System.out.println(list);

        System.out.println("---retain All (keep) (remove the elements that are unmatching) (is opposite that removeAll)---");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll( Arrays.asList(  "Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar" , "Alena")  );

        developers.retainAll(  Arrays.asList("Alena", "Khashayar", "Muhtar") );

        System.out.println(developers);

        System.out.println("---------------retainAll vs removeAll----------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels")
        );

        //   groceriesList.retainAll( Arrays.asList("Eggs", "Potato",  "Milk", "Tomato") );
        groceriesList.removeAll( Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper towels") );

        System.out.println(groceriesList);








    }
}
