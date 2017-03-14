package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class GoodDogTestDrive {
    public static void main (String [] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());

        one.bark();
        two.bark();

        GoodDog [] pets;
        pets = new GoodDog[7];

        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(30);
        pets[1].setSize(8);

        int x = pets[0].getSize();
        int y = pets[1].getSize();

        System.out.println("pets[0] = " + x);
        System.out.println("pets[1] = " + y);

    }
}
