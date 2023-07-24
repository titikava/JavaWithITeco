package designPatterns.task1;

public class Earth {
    private static Earth instance = new Earth();

    // Закрываем конструктор, чтобы предотвратить создание новых экземпляров класса
    private Earth() {
    }

    public static Earth getInstance() {
        return instance;
    }
}
// Использован паттерн Singleton для реализации класса Земля