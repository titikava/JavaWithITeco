package principlesOfOOP.task1;

public class Tie extends Clothing implements MensClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук");
    }

    @Override
    public void displayInfo() {
        System.out.println("Размер: " + size);
        System.out.println("Стоимость: " + cost);
        System.out.println("Цвет: " + color);
    }
}
