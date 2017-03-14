package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Dog {
    int size;
    String name;

    void bark(int count) {

        do {
            if (size > 60) {
                System.out.println("Гав Гав!");
            } else if (size > 14) {
                System.out.println("Вуф Вуф!");
            } else {
                System.out.println("Тяф Тяф!");
            }
            count -= 1;
        }while (count > 0);
    }
}
