package basicOperationsAndCycles;

/**
 * Задача №3: Удаление пробелов (Со звёздочкой)
 * Дано: строка str, начальное значение можно указать любое.
 * <p>
 * Напишите программу, которая удаляет в строке все лишние пробелы, то есть серии подряд идущих пробелов
 * заменяет на одиночные пробелы. Крайние пробелы в строке также должны удалиться.
 * <p>
 * Пример: str = " привет,   в этой    строке лишние   пробелы.  "
 * <p>
 * Результат: "привет, в этой строке лишние пробелы"
 */
public class Task3 {
    public static void main(String[] args) {
        String str = " привет,   в этой    строке лишние   пробелы.  ";
        char[] charArray = str.toCharArray();
        StringBuilder result = new StringBuilder();

        boolean previousSpace = false;
        for (char c : charArray) {
            if (c != ' ') {
                result.append(c);
                previousSpace = false;
            } else {
                if (!previousSpace) {
                    result.append(' ');
                    previousSpace = true;
                }
            }
        }
        String trimmedStr = result.toString().trim();
        System.out.println(trimmedStr);
    }
}
