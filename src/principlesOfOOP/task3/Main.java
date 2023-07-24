package principlesOfOOP.task3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Задача №3: Интернет-магазин (Со звёздочкой)
 * Создаем мини приложение - интернет-магазин.  Должны быть реализованы следующие возможности:
 *
 * Аутентификация пользователя. Пользователь вводит логин и пароль.
 * Просмотр списка каталогов товаров.
 * Просмотр списка товаров определенного каталога.
 * Выбор товара в корзину.
 * Покупка товаров, находящихся в корзине.
 * Создаем перечисление содержащее значения для перечисленных операций. Можете добавить свои операции
 * или изменить что-то на свой вкус.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем каталоги товаров и заполняем их продуктами
        Catalog catalog1 = new Catalog("Catalog 1");
        catalog1.addProduct(new Product("Product 1", 10.0));
        catalog1.addProduct(new Product("Product 2", 20.0));
        catalog1.addProduct(new Product("Product 3", 30.0));

        Catalog catalog2 = new Catalog("Catalog 2");
        catalog2.addProduct(new Product("Product 4", 40.0));
        catalog2.addProduct(new Product("Product 5", 50.0));
        catalog2.addProduct(new Product("Product 6", 60.0));

        // Создаем массив каталогов и массив пользователей
        Catalog[] catalogs = {catalog1, catalog2};
        User[] users = {new User("user1", "password1"), new User("user2", "password2")};
// Симулируем диалог с пользователем
        Scanner scanner = new Scanner(System.in);

        // Аутентификация
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User currentUser = null;
        for (User user : users) {
            if (user.authenticate(username, password)) {
                currentUser = user;
                break;
            }
        }

        if (currentUser == null) {
            System.out.println("Authentication failed.");
            return;
        }

        System.out.println("Authentication successful.");

        // Просмотр списка каталогов
        System.out.println("Catalogs:");
        for (int i = 0; i < catalogs.length; i++) {
            System.out.printf("%d. %s\n", i + 1, catalogs[i].getName());
        }

        // Просмотр списка товаров в каталоге
        System.out.print("Enter catalog number: ");
        int catalogNumber = scanner.nextInt();
        Catalog selectedCatalog = catalogs[catalogNumber - 1];

        System.out.printf("Products in %s:\n", selectedCatalog.getName());
        ArrayList<Product> products = selectedCatalog.getProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s - $%.2f\n", i + 1, products.get(i).getName(), products.get(i).getPrice());
        }

        // Выбор товара в корзину
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.print("Enter product number (0 to exit): ");
            int productNumber = scanner.nextInt();

            if (productNumber == 0) {
                break;
            }

            Product selectedProduct = products.get(productNumber - 1);
            cart.addProduct(selectedProduct);

            System.out.printf("%s added to cart.\n", selectedProduct.getName());
        }

        // Покупка товаров в корзине
        double total = 0;
        System.out.println("Cart:");
        for (Product product : cart.getProducts()) {
            System.out.printf("%s - $%.2f\n", product.getName(), product.getPrice());
            total += product.getPrice();
        }

        System.out.printf("Total: $%.2f\n", total);

        scanner.close();
    }
}
