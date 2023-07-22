package principlesOfOOP.task1;

public class Skirt extends Clothing implements WomensClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская юбка");
    }

    @Override
    public void displayInfo() {
        System.out.println("Размер: " + size);
        System.out.println("Стоимость: " + cost);
        System.out.println("Цвет: " + color);
    }
}
