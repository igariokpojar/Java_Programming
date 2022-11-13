package src.day26_statics;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Alexandru", "main str", 5);

        Server server1 = new Server("Igariok", 123, 20, true, LocalDate.of(2020, 10, 10));
        Server server2 = new Server("Alla", 124, 20, true, LocalDate.of(2020, 11, 10));
        Server server3 = new Server("Alexandra", 125, 20, false, LocalDate.of(2020, 10, 20));

        Server[] servers = {server1, server2, server3};

        restaurant1.hireServer(servers);

        Chef chef1 = new Chef("George", 111, 30, true);
        Chef chef2 = new Chef("Adelina", 112, 30, true);

        Chef[] chefs = {chef1, chef2};

        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);

    }
}
