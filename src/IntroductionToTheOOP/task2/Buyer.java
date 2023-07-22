package IntroductionToTheOOP.task2;

/**
 * Задача №2: Класс покупатель (База)
 * Создать класс покупатель с полями: фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 *
 * Создать список из 5 покупателей (в main).
 * Вывести:
 * Имя покупателя с самой длинной фамилией
 * Адреса всех покупателей, у кого первая цифра номера кредитки 5.
 * Всех покупателей с отчеством "Евгеньевич"
 */

public class Buyer {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    Buyer (String lastName, String firstName, String patronymic, String address, String creditCardNumber,
           String bankAccountNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString(){
        return "Имя - " + firstName + "; Фамилия - " + lastName;
    }
}
