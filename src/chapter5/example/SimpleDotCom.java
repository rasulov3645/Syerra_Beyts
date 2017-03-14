package chapter5.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class SimpleDotCom {

    int [] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int [] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess ) {

        // Преобразуем тип String в int.
        int guess = Integer.parseInt(stringGuess);

        // Создаем переменную для хранения результата,
        // который будем возвращать. Присваиваем по
        // умолчанию  строковое значение "Мимо"
        // (то есть подразумеваем промах).
        String result = "Мимо";

        // Повторяем с каждой ячейкой из
        // массива locationCells (местоположения
        // ячейки объекта)
        for (int cell : locationCells) {
            // Сравниваем ход пользователя с этим
            // элементом (ячейкой) массива.
            if (guess == cell) {
                result = "Попал"; // Мы обнаружили
                numOfHits++;      // попадение!
                break;       // Выбираемся из цикла
            }
        }

        // Мы вышли из цикла, но просмотрим не потопили
        // ли нас (три попадения), и при необходимости
        // изменим результат на "Потопил".
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }

        // Выводим пользователю результат
        // ("Мимо", если он не был изменен на
        // "Попал" или "Потопил").
        System.out.println(result);

        return result; // Возвращаем результат в вызывающий метод.
    }
}
