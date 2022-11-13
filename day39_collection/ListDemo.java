package day39_collection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);

        System.out.println("____________LinkedList_________________________");

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked List) ===> add(),
        // addAll(), remove(), removeAll(), removeIf(), retainAll() are faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        Integer num = linkedList.get(1);

        System.out.println(num);


        System.out.println("-------------vector-----------------------------");


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        Integer element = vector.get(0);

        System.out.println(element);


        System.out.println("---------------Stack-----------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);


    }
}
