package day25_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMovieObjects {
    public static void main(String[] args) {
        Movie mov = new Movie("USA", "Java Developer: Zero to Hero", LocalDate.of(2021, 4, 18), "Kuzzat Altay");

        mov.casts = new ArrayList<>(Arrays.asList("Ozzy", "Muhtar"));
        mov.addCast("Alexandru");
        String[] addToCast = {"Igariok", "Alla", "Maria", "Bogdan", "Adelina"};
        mov.addCasts(addToCast);

        System.out.println(mov);
    }
}
/*
create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */