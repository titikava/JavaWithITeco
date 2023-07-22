package principlesOfOOP.task1;

public class Atelier {
    public static void dressMan(Clothing[] clothes) {
        for (Clothing c : clothes) {
            if (c instanceof MensClothing) {
                c.displayInfo();
            }
        }
    }

    public static void dressWoman(Clothing[] clothes) {
        for (Clothing c : clothes) {
            if (c instanceof WomensClothing) {
                c.displayInfo();
            }
        }
    }
}
