package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задача №2: Очередь в банк (Со звёздочкой)
 * В отделении банка работает K окон, в общей очереди стоит N человек, каждому из которых понадобится
 * 10 минут на обслуживание. Вывести всех посетителей, кто подойдет к окнам через M минут от начала смены.
 * <p>
 * Пример:
 * <p>
 * Очередь N {Миша, Петя, Катя, Игорь}
 * <p>
 * Окно K = 2
 * <p>
 * M = 15 минут
 * <p>
 * Ответ: на 15 минуте у окон будут стоять Катя и Игорь
 */

public class Task2 {
    public static void main(String[] args) {
        int window = 2; //работающие окна
        ArrayList<String> people = new ArrayList<>(Arrays.asList("Миша", "Петя", "Катя", "Игорь", "Вася"));
        int queueLength = people.size(); //длина очереди
        int serviceTime = 10; //время обслуживания
        int howMuchTimeHasPassed = 20; //сколько прошло времени от начала смены
        int count = 0;
        // вычисляем, сколько человек может быть обслужено за это время
        int servedCount = howMuchTimeHasPassed / serviceTime * window;

        // выводим список посетителей, если есть еще необработанные
        if (servedCount < queueLength) {
            String message = "Посетители, подойдущие к окнам через " +
                    howMuchTimeHasPassed + " минут после начала смены: ";
            for (int i = 0; i < queueLength; i++) {
                if (i >= servedCount) {
                    count++;
                    if (count <= window) {
                        message += people.get(i) + " ";
                    }
                }
            }
            System.out.println(message);
        } else {
            System.out.println("Никто не подойдет к окнам через " + howMuchTimeHasPassed + " минут после начала смены.");
        }
    }
}
