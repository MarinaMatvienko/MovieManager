package ru.netology.manager;

import ru.netology.domain.Movie;

public class Main {

    public static void main(String[] args) {

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

        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        Movie[] all = manager.findLast();//Отдает в обратном порядке.

    }

}
