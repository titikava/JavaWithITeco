package basicOperationsAndCycles;

import java.util.Scanner;

/**
 * Задача №4: Натуральное число (Со звёздочкой)
 * Дано: целочисленное число n, начальное значение может быть любое.
 *
 * Напишите программу, которая определяет: (можно сделать не все варианты, а выбрать понравившийся)
 * а) количество цифр в нем;
 * б) сумму его цифр;
 * в) произведение его цифр;
 * г) среднее арифметическое его цифр;
 * д) сумму квадратов его цифр;
 * е) сумму кубов его цифр;
 * ж) его первую цифру;
 * з) сумму его первой и последней цифр.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // а) количество цифр в числе
        int digitCount = String.valueOf(n).length();
        System.out.println("Количество цифр: " + digitCount);

        // б) сумма цифр числа
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Сумма цифр: " + sum);

        // в) произведение цифр числа
        int product = 1;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        System.out.println("Произведение цифр: " + product);

        // г) среднее арифметическое цифр числа
        int average = sum / digitCount;
        System.out.println("Среднее арифметическое цифр: " + average);

        // д) сумма квадратов цифр числа
        int squareSum = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            squareSum += digit * digit;
            temp /= 10;
        }
        System.out.println("Сумма квадратов цифр: " + squareSum);

        // е) сумма кубов цифр числа
        int cubeSum = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            cubeSum += digit * digit * digit;
            temp /= 10;
        }
        System.out.println("Сумма кубов цифр: " + cubeSum);

        // ж) первая цифра числа
        int firstDigit = 0;
        temp = n;
        while (temp != 0) {
            firstDigit = temp % 10;
            temp /= 10;
        }
        System.out.println("Первая цифра: " + firstDigit);

        // з) сумма первой и последней цифры числа
        int lastDigit = n % 10;
        int sumFirstLast = firstDigit + lastDigit;
        System.out.println("Сумма первой и последней цифры: " + sumFirstLast);
    }
}
