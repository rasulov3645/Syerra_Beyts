package chapter3.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Hobbits {
    String name;

    public static void main(String [] args) {
        Hobbits [] h = new Hobbits[3];
        int z = -1;

        // Здесь выходила за размер массива.
        while (z < 2) {    // Мой ответь:-> z < 3. Правильный ответь:--> z < 2
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";

            if (z == 1) {
                h[z].name = "Фродо";
            }
            if (z == 2) {
                h[z].name = "Сэм";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("имя хорошого" + " хоббита");
        }

    }
}
