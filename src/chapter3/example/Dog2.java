package chapter3.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Dog2 {
    String name;
    public static void main (String[] args) {

        // Создаем объект Dog и получаем к нему доступ
        Dog2 dog1 = new Dog2();
        dog1.bark();
        dog1.name = "Барт";

        // Теперь создадим массив типа Dog
        Dog2[] myDogs = new Dog2[3];

        // и поместим в него несколько элементов
        myDogs[0] = new Dog2();
        myDogs[1] = new Dog2();
        myDogs[2] = dog1;

        // Теперь получаем доступ к объектам Dog
        // с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        // Хмммм... какое имя у myDogs[2]?
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        // Теперь перебираем все элементы массива
        // и вызовем для каждого метод bark()
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name + " сказал Гав!");
    }

    public void eat() { }
    public void chaseCat() { }
}
