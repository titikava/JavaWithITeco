package advancedJava.task4;

public class RegistrationHelper {
    public static void register(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        if (!isValidLogin(login)) {
            throw new WrongLoginException("Invalid login");
        }

        if (!isValidPassword(password, confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }

        // Регистрация пользователя...
    }

    private static boolean isValidLogin(String login) {
        String regex = "^[a-zA-Z0-9_]{1,20}$";
        return login.matches(regex);
    }

    private static boolean isValidPassword(String password, String confirmPassword) {
        String regex = "^[a-zA-Z0-9_]{1,20}$";
        return password.matches(regex) && password.equals(confirmPassword);
    }
}
