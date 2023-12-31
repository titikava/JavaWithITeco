package designPatterns.task2;

/**
 * Задача №2: Студент (База)
 * Создать класс студента, который содержит следующую информацию: имя, фамилия, год рождения, курс, город рождения,
 * университет.
 * Абитуриенты подают большое количество заявок каждый год, для этого нам необходимо поддержать гибкие возможности
 * по наполнению данных студента.
 * Часто передается неполная информация о студентах, реализуйте примеры:
 * 1) Создание студента по имени и фамилии
 * 2) Создание студента по университету
 * Подсказка: используем паттерн проектирования builder.
 */
public class Main {
    public static void main(String[] args) {
        // 1) Создание студента по имени и фамилии
        Student student1 = new Student.Builder()
                .setFirstName("Иван")
                .setLastName("Иванов")
                .build();

        // 2) Создание студента по университету
        Student student2 = new Student.Builder()
                .setUniversity("Московский государственный университет")
                .build();
    }
}

