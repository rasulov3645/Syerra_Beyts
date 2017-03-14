package chapter5.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Main {
    public static void main(String[] args) {

        // Создаем переменную, чтобы следить
        // за количеством ходов пользователя.
        int numOfGuesses = 0;

        // Это специальный класс, который содержит метод для
        // приема пользовательского ввода. Пока
        // сделаем вид, что это часть Java.
        GameHelper helper = new GameHelper();

        // Создаем объект "сайт"
        SimpleDotCom theDotCom = new SimpleDotCom();

        // Генерируем случайное число для первой ячейки и используем
        // его для форматирования массива ячеек.
        int randomNum  = (int) (Math.random() * 5);
        int [] locations = {randomNum, randomNum+1, randomNum+2};

        // Передаем "сайту" местоположение его ячеек(массив).
        theDotCom.setLocationCells(locations);

        // Создаем булеву переменную, чтобы проверять в цикле, не
        // закончилась ли игра.
        boolean isAlive = true;

        while (isAlive == true) {

            // Пулучаем строку, вводимую пользователем.
            String guess = helper.getUserInput("Введите число");

            // Просим "сайт" проверить полученные данные;
            // сохраняем возвращенный результат в перемен-
            // ную типа String.
            String result = theDotCom.checkYourself(guess);
            // Инкрементируем количество попыток.
            numOfGuesses++;

            // Потоплен ли "сайт"? Если да, то присваиваем isAlive
            // значение false (так как не хотим продолжать цикл) и
            // выводим на экран количество попыток.
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses +
                        " попыток(и)");

            }
        }

    } // Завершаем метод main
}
