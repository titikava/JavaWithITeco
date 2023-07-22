package IntroductionToTheOOP.task3;

import java.util.Arrays;

public class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(bookTitles));
    }

    public void takeBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        sb.append(fullName).append(" взял книги: ");
        for (Book book : books) {
            sb.append(book.getTitle()).append(" (").append(book.getAuthor()).append("), ");
        }
        String result = sb.toString().trim();
        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(bookTitles));
    }

    public void returnBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        sb.append(fullName).append(" вернул книги: ");
        for (Book book : books) {
            sb.append(book.getTitle()).append(" (").append(book.getAuthor()).append("), ");
        }
        String result = sb.toString().trim();
        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
    }
}
