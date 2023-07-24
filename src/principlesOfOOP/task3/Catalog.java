package principlesOfOOP.task3;

import java.util.ArrayList;

public class Catalog {
    private String name;
    private ArrayList<Product> products;

    public Catalog(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}
