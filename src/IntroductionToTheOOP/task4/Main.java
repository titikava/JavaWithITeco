package IntroductionToTheOOP.task4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HomeLibrary library = new HomeLibrary();

        library.addBook(new Book("Название 1", "Автор 1", 2000));
        library.addBook(new Book("Название 2", "Автор 2", 1995));
        library.addBook(new Book("Название 3", "Автор 1", 2010));

        // Поиск книг по автору
        List<Book> booksByAuthor = library.searchByAuthor("Автор 1");
        System.out.println("Книги которые написал Автор 1:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Поиск книг по году издания
        List<Book> booksByYear = library.searchByYear(2000);
        System.out.println("Книги изданные в 2000:");
        for (Book book : booksByYear) {
            System.out.println(book.getTitle());
        }

        // Сортировка книг по названию
        library.sortByTitle();
        System.out.println("Отсортированные по названию книги:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
