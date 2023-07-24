package advancedJava.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int oddCount = CountElements.countOdd(numbers);
        int primesCount = CountElements.countPrimes(numbers);

        System.out.println("Нечетных цифр: " + oddCount);
        System.out.println("Простых цифр: " + primesCount);
    }
}
