package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {
    Movie film1 = new Movie(101, 1, "Бладшот - Начало.", 400, 2);
    Movie film2 = new Movie(102, 2, "Вперёд", 600, 2);
    Movie film3 = new Movie(103, 3, "Отель Белград", 700, 4);
    Movie film4 = new Movie(104, 4, "Джентльмены", 800, 2);
    Movie film5 = new Movie(105, 5, "Человек-неведимка", 300, 2);
    Movie film6 = new Movie(106, 6, "Тролли.Мировой тур", 400, 6);
    Movie film7 = new Movie(107, 7, "Номер один", 500, 1);
    Movie film8 = new Movie(108, 8, "Мы Миллеры", 700, 3);
    Movie film9 = new Movie(109, 9, "Война и мир", 400, 5);
    Movie film10 = new Movie(110, 10, "Анна Каренина", 300, 4);
    Movie film11 = new Movie(111, 11, "Лавина", 400, 6);

    @Test
    public void test1FindLast() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        Movie[] actual = manager.findLast();
        Movie[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2FindLast() {
        MovieManager manager = new MovieManager();
        manager.add(film1);


        Movie[] actual = manager.findLast();
        Movie[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3FindLast() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movie[] actual = manager.findLast();
        Movie[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4FindLast() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);


        Movie[] actual = manager.findLast();
        Movie[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void test5FindLast() {
        MovieManager manager = new MovieManager();


        Movie[] actual = manager.findLast();
        Movie[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindAll() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        Movie[] actual = manager.findAll();
        Movie[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};

        assertArrayEquals(actual, expected);
    }

}