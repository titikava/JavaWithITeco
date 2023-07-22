package IntroductionToTheOOP.task1;

/**
 * Задача №1: Класс Person (База)
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса (в методе main). Один объект инициализируется конструктором Person(),
 * другой - Person(fullName, age).
 * Для удобства рекомендуется сделать папку lesson4 внутри которой сделать папку task1 и создать отдельно класс
 * Main и класс Person (как на практике).
 */

public class Person {
    private String fullName;
    private int age;

    Person() {
    }

    Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}
