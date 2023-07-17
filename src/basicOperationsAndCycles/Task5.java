package basicOperationsAndCycles;

import java.util.Locale;

/**
 * Задача №5: Цифры в строке (Со звёздочкой)
 * Дано: строка str, начальное значение может быть любое.
 *
 * Напишите программу, считающую количество цифр 1, 2, 3 в строке.
 *
 * Пример: str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина"
 *
 * Кол-во 1: 2
 *
 * Кол-во 2: 1
 *
 * Кол-во 3: 0
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == '1') {
                count1++;
            }
            if (aChar == '2') {
                count2++;
            }
            if (aChar == '3') {
                count3++;
            }
        }
        System.out.println("Кол-во 1: " + count1);
        System.out.println("Кол-во 2: " + count2);
        System.out.println("Кол-во 3: " + count3);
    }
}
