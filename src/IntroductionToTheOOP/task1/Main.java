package IntroductionToTheOOP.task1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Валерий", 23);
        person1.setFullName("Игорь");

        person1.move();
        person2.talk();
    }
}
