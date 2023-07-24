package advancedJava.task3;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        division(a, b);
    }

    public static void division(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
}
