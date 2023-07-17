package basicOperationsAndCycles;

/**
 * Задача №1: Возведение в степень (База)
 * Дано: переменная int count, начальное значение можно указать любое.
 * Напишите программу, которая выводит на экран count в степени 10, если count является чётным числом,
 * и count в степени 3, если count нечётное.
 */
public class Task1 {
    public static void main(String[] args) {
        int count = 2;
        if (count % 2 == 0) {
            System.out.println(Math.pow(count, 10));
        } else {
            System.out.println(Math.pow(count, 3));
        }
    }
}
