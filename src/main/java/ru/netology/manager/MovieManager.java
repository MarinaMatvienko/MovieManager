package ru.netology.manager;


import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] playbill = new Movie[0];
    private int limit;

    public MovieManager() {
        limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }


    public void add(Movie item) {
        int length = playbill.length + 1;//Длинна нового массива.
        Movie[] tmp = new Movie[length];//Создаеться новый массив.____[length]
        System.arraycopy(playbill, 0, tmp, 0, playbill.length);
        //Playbill - откуда копируем. srcPos - с какой позиции копируем. tmp - куда копируем. desPos - с какой позиции копируем. playbill.length - сколько копируем.

        int lastIndex = tmp.length - 1; // Кладем из старого массива в новый. Вычесляет ячейку которая не заполнена.
        tmp[lastIndex] = item;
        playbill = tmp;

    }

    public Movie[] findLast() { //Добавления в обратном порядке.
        Movie[] playbill = findAll();
        Movie[] result;
        if (limit < playbill.length) {
            result = new Movie[limit];
        } else {
            result = new Movie[playbill.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = playbill.length - i - 1; //Берем размер массива(playbill.length). Ячейка куда хотим скопировать(i) и минус один (Потому что начинаеться с нуля).
            result[i] = playbill[index];
        }
        return result;
    }

    public Movie[] findAll() { //Вывод всех фильмов в порядке добавления.
        return playbill;
    }

}
