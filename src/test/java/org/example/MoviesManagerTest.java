package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {


    @Test


    public void shouldFindLastMoviesEqual5() {
        MoviesManager manager = new MoviesManager(5);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");


        String[] actual = manager.findLast();
        String[] expected = {"movie10", "movie9", "movie8", "movie7", "movie6"};

        assertArrayEquals(expected, actual);
    }

    @Test


    public void shouldFindLastMoviesEqual12() {
        MoviesManager manager = new MoviesManager(12);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");


        String[] actual = manager.findLast();
        String[] expected = {"movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSetFindAllMovies() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");


        String[] actual = manager.findAll();
        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10"};
        assertArrayEquals(expected, actual);
    }

}
