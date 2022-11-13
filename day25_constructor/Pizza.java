package day25_constructor;

public class Pizza {
    public char size;
    public int numberOfCheeseToppings, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost() {
        int cost = 0;
        switch (size) {
            case 'S':
                cost = 10 + 2 * numberOfCheeseToppings + 2 * numberOfPepperoniTopping;
                break;
            case 'M':
                cost = 12 + 2 * numberOfCheeseToppings + 2 * numberOfPepperoniTopping;
                break;
            case 'L':
                cost = 14 + 2 * numberOfCheeseToppings + 2 * numberOfPepperoniTopping;
                break;
        }
        return cost;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Cost=" + calcCost() +
                '}';
    }
}
/*
Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */