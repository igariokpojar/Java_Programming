package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

        public String country, title, genre, director;
        public LocalDate releaseDate;
        public ArrayList<String> casts;

        public Movie(String country, String title, LocalDate releaseDate, String director) {
            this.country = country;
            this.title = title;
            this.releaseDate = releaseDate;
            this.director = director;
        }

        public void addCast(String castMember) {
            casts.add(castMember);
            System.out.println(castMember + " added to the cast");
        }

        public void addCasts(String[] castMembers) {
            casts.addAll(Arrays.asList(castMembers));
            System.out.println(Arrays.toString(castMembers) + " added to cast");
        }

        public String toString() {
            return "Movie{" +
                    "country='" + country + '\'' +
                    ", title='" + title + '\'' +
                    ", genre='" + genre + '\'' +
                    ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("M/dd/y")) +
                    ", director='" + director + '\'' +
                    ", casts=" + casts +
                    '}';


        }
    }

/*
Task03:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

 */