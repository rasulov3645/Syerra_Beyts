package chapter5.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class SimpleDotComTestDrive {
    public static void main (String [] args) {

        // Создаем экзампляр класса SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();

        // Создаем массив для местоположения "Сайта"
        // (три последовательных числа из семи)
        int [] locations = {2,3,4};

        // Вызываем сеттер "сайта".
        dot.setLocationCells(locations);

        // Делаем хот от имени пользователя.
        String userGuess = "2";

        // Вызываем метод checkYourself() объекта SimpleDotCom
        String result = dot.checkYourself(userGuess);

        String testResult = "Неудача";

        if (result.equals("Попал") ) {
            testResult = "Пройден";
        }

        // Печатает результат прохождения теста
        // "Пройден" или "Неудача"
        System.out.println(testResult);
    }
}
