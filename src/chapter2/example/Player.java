package chapter2.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Player {
    int number = 0; // Здесь храниться вариант числа

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}

