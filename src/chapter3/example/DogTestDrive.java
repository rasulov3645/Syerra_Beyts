package chapter3.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class DogTestDrive {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.size = 40;
        d.bark();

        Dog fido  = new Dog();
        fido.name = "Фидо";

        Dog [] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Фидо";
        myDogs[0].bark();

    }
}
