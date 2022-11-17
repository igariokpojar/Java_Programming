package day21_MultyDimentionalArray;

import utilities.ArrasUtility;

public class Arrays {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] eachItems : items){
            for (String eachItem : eachItems) {
                System.out.println(eachItem + "\t");
            }
            System.out.println();
        }

        for (String[] eachItems : items){
            for (int i = eachItems.length - 1; i >= 0; i--) {
                String eachItem2 = eachItems[i];
                System.out.println(eachItem2 + "\t");
            }
            System.out.println();
        }
        for (int i = items.length - 1; i >= 0; i--) {
            String[] eachItems3 = items[i];
            for (String eachItem3 : eachItems3){
                System.out.println(eachItem3 + "\t");
        }
            System.out.println();

        }

        System.out.println("_________________second method________________________________________________________");


        for (String[] each1D : items) {
            System.out.println(); //to start a new line for each Array
            for (String eachItem : each1D) {// to print each item in array
                System.out.print(eachItem+"\t");
            }
        }
        System.out.println("________________________________________________");


        for (String[] eachArray : items) {
            eachArray= ArrasUtility.reverse(eachArray);
            System.out.println();
            for (String eachElement : eachArray) {
                System.out.print(eachElement+"\t");
            }
        }
        System.out.println("________________________________________________");

        for (int i = items.length - 1; i >= 0; i--) {
            String[] array=items[i];
            System.out.println();
            for (String eachIt : array) {
                System.out.print(eachIt+"\t");
            }
        }
    }

}
/*
Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado

 */