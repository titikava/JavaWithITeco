package IntroductionToTheOOP.task3;

/**
 * Задача №3: Библиотека (Со звёздочкой)
 * Создать класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
 * факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * <p>
 * 1. takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * 2.  takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
 * "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * 3. takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
 * имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
 * Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
 */

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В. В.", 12345, "Факультет",
                "01.01.2000", "+7-123--7890");

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader.takeBook(3);

        reader.takeBook("Приключения", "Словарь", "Энциклопедия");

        reader.takeBook(book1, book2, book3);

        reader.returnBook(3);

        reader.returnBook("Приключения", "Словарь", "Энциклопедия");

        reader.returnBook(book1, book2, book3);
    }
}
