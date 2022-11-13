package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHouseObjects {

    public static void main(String[] args) {

        ArrayList<House> listings = new ArrayList<>();

        House squareHouse2 = new Square("SquareHouse2",25);
        House squareHouse3 = new Square("SquareHouse3",30);
        House rectangleHouse1 = new Rectangles("RectangleHouse1",20, 30);
        House rectangleHouse2 = new Rectangles("RectangleHouse2",20, 25);
        House circleHouse1 = new Circle1("CircleHouse1",15);
        House circleHouse2 = new Circle1("CircleHouse2",20);
        House circleHouse3 = new Circle1("CircleHouse2",20);

        listings.addAll(Arrays.asList(squareHouse2,squareHouse3,rectangleHouse1,rectangleHouse2,circleHouse1,circleHouse2,squareHouse3));

        //System.out.println((squareHouse2.calculate()));
        //System.out.println(listings);
        System.out.println(properties(listings,600));


    }
    public static ArrayList<House> properties(ArrayList<House> listing, int x ){

        ArrayList<House> y = new ArrayList<>();
        for (House each : listing) {
            if (each.calculate()>=x){
                y.add(each);
            }


        }
        return y;

    }
}
