package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    void shouldMovieManagerMoreLimit (){
        String movie1 = "Bloodshot";
        String movie2 = "Onward";
        String movie3 = "Hotel Belgrade";
        String movie4 = "Gentlemen";
        String movie5 = "The Invisible Man";
        String movie6 = "Trolls World Tour";
        String movie7 = "Number one";
        String movie8 = "White noise";
        String movie9 = "Call me";
        String movie10 = "Soul";
        String movie11 = "Dark shadow";

        MovieManager manager = new MovieManager(11);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldMovieManagerMinLimit (){
        String movie1 = "Bloodshot";

        MovieManager manager = new MovieManager(1);
        manager.addMovie(movie1);

        String[] actual = manager.findAll();
        String[] expected = {movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
   @Test
    void shouldFindAllMovie (){
        String movie1 = "Bloodshot";
        String movie2 = "Onward";
        String movie3 = "Hotel Belgrade";
        String movie4 = "Gentlemen";
        String movie5 = "The Invisible Man";
        String movie6 = "Trolls World Tour";
        String movie7 = "Number one";

       MovieManager manager = new MovieManager();
       manager.addMovie(movie1);
       manager.addMovie(movie2);
       manager.addMovie(movie3);
       manager.addMovie(movie4);
       manager.addMovie(movie5);
       manager.addMovie(movie6);
       manager.addMovie(movie7);

       String[] actual = manager.findAll();
       String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};

       Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindLastMovie () {
        String movie1 = "Bloodshot";
        String movie2 = "Onward";
        String movie3 = "Hotel Belgrade";
        String movie4 = "Gentlemen";
        String movie5 = "The Invisible Man";
        String movie6 = "Trolls World Tour";
        String movie7 = "Number one";

        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindLastThreeMovie () {
        String movie5 = "The Invisible Man";
        String movie6 = "Trolls World Tour";
        String movie7 = "Number one";

        MovieManager manager = new MovieManager();
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindFiveMovie (){
        String movie1 = "Bloodshot";
        String movie2 = "Onward";
        String movie3 = "Hotel Belgrade";
        String movie4 = "Gentlemen";
        String movie5 = "The Invisible Man";


        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);


        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindAllAddMovie (){
        String movie1 = "Bloodshot";
        String movie2 = "Onward";
        String movie3 = "Hotel Belgrade";
        String movie4 = "Gentlemen";
        String movie5 = "The Invisible Man";
        String movie6 = "Trolls World Tour";
        String movie7 = "Number one";
        String movie8 = "White noise";


        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8};

        Assertions.assertArrayEquals(expected, actual);
    }
}
