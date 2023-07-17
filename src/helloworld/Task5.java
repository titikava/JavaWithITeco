package helloworld;


/**
 * Задача №5: Месяца года (Со звёздочкой)
 * Реализуйте все месяца года (январь, февраль ..) в рамках Java программы и напечатайте месяц своего рождения.
 */
public class Task5 {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь",
                "октябрь", "ноябрь", "декабрь"};
            for (String month : months) {
                if(month.equals("январь")) System.out.println("Мой месяц рождения - " + month);
        }
    }
}
