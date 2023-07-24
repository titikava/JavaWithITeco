package advancedJava.task4;

public class Main {
    public static void main(String[] args) {
        try {
            RegistrationHelper.register("my_log*&^in123", "my_password", "my_pass2word");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка валидации логина: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        }
    }
}
