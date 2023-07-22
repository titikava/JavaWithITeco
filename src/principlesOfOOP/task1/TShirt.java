package principlesOfOOP.task1;

public class TShirt extends Clothing implements MensClothing, WomensClothing{
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская футболка");
    }

    @Override
    public void displayInfo() {
        System.out.println("Размер: " + size);
        System.out.println("Стоимость: " + cost);
        System.out.println("Цвет: " + color);
    }
}
