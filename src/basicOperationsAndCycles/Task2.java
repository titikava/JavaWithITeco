package basicOperationsAndCycles;

/**
 * Задача №2: Подсчёт не делящихся чисел (База)
 * Дано: целочисленное n, начальное значение можно указать любое.
 * <p>
 * Найти количество натуральных чисел, не превосходящих n и не делящихся ни на одно из чисел 2, 3, 5
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                count++;
            }
        }
        System.out.println("Количество чисел: " + count);
    }
}
