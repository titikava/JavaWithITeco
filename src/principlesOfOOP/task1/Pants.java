package principlesOfOOP.task1;

public class Pants extends Clothing implements MensClothing, WomensClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женские штаны");
    }

    @Override
    public void displayInfo() {
        System.out.println("Размер: " + size);
        System.out.println("Стоимость: " + cost);
        System.out.println("Цвет: " + color);
    }
}
