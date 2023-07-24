package principlesOfOOP.task2;

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
