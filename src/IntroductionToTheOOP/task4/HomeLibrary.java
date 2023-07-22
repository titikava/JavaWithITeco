package IntroductionToTheOOP.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeLibrary {
    private List<Book> books;

    public HomeLibrary() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public void sortByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public void sortByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
    }

    public void sortByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }
}
