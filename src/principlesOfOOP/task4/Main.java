package principlesOfOOP.task4;

/**
 * Задача №4: Аспирант (База)
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента
 * наличием некой научной работы.
 * а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark,
 * содержащую среднюю оценку.
 * б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 * в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
 * Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.
 * Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
 * г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Иван", "Иванов", "Группа 1", 4.5);
        students[1] = new Student("Петр", "Петров", "Группа 2", 5);
        students[2] = new Aspirant("Андрей", "Андреев", "Группа 3", 4.8,
                "Методы оптимизации");

        for (Student student : students) {
            System.out.println("Студент " + student.firstName + " " + student.lastName +
                    " получает стипендию в размере " + student.getScholarship() + " грн.");
        }
    }
}
