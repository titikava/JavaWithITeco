package principlesOfOOP.task2;

/**
 * Задача №2: Интерфейс Printable (База)
 * Определить интерфейс Printable, содержащий метод void print().
 * Определить класс Book, реализующий интерфейс Printable.
 * Определить класс Magazine, реализующий интерфейс Printable.
 * Создать массив типа Printable, который будет содержать книги и журналы.
 * В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 * Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
 * который выводит на консоль названия только журналов.
 * Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия
 * только книг. Используем оператор instanceof для определения типа.
 */
public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[6];
        printables[0] = new Magazine("Журнал 1");
        printables[1] = new Book("Книга 1");
        printables[2] = new Magazine("Журнал 2");
        printables[3] = new Magazine("Журнал 3");
        printables[4] = new Book("Книга 2");
        printables[5] = new Magazine("Журнал 4");

        for (Printable printItem : printables) {
            printItem.print();
        }
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
