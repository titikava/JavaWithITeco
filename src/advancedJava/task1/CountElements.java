package advancedJava.task1;

import java.util.List;

public class CountElements {

    // подсчет количества нечетных целых чисел
    public static <Type extends Number> int countOdd(List<Type> list) {
        int count = 0;
        for (Type num : list) {
            if (num instanceof Integer && ((Integer) num) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // подсчет количества простых чисел
    public static <Type extends Number> int countPrimes(List<Type> list) {
        int count = 0;
        for (Type num : list) {
            if (num instanceof Integer && isPrime(((Integer) num))) {
                count++;
            }
        }
        return count;
    }

    // проверка, является ли число простым
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
