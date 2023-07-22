package principlesOfOOP.task1;

abstract class Clothing {
    protected ClothingSize size;
    protected double cost;
    protected String color;

    public Clothing(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public abstract void displayInfo();
}
