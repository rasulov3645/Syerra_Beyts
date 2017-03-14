package chapter2.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class MovieTestDrive {
    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в Офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.title = "Трагидия, но в целом веселия";
        three.rating = 127;

    }
}
