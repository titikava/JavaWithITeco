package principlesOfOOP.task2;

public class Book implements Printable {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Книга - " + bookName);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable printItem : printable) {
            if (printItem instanceof Book) {
                System.out.println("Book: " + ((Book) printItem).bookName);
            }
        }
    }
}
