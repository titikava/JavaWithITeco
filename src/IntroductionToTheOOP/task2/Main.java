package IntroductionToTheOOP.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Buyer> buyers = new ArrayList<>();
        buyers.add((new Buyer("Иванов", "Игорь", "Валерьевич", "Москва",
                "1234 1234 1234 1234", "225548846")));
        buyers.add((new Buyer("Петров", "Валентин", "Евгеньевич", "Питер",
                "5234 1234 1234 1234", "525548846")));
        buyers.add((new Buyer("Сидорова", "Елена", "Владимировна", "Псков",
                "5234 5555 1234 1234", "525778846")));
        buyers.add((new Buyer("Светлов", "Олег", "Евгеньевич", "Тамбов",
                "6234 5555 1234 1234", "625778846")));
        buyers.add((new Buyer("Коломийцева", "Валерия", "Олеговна", "Киров",
                "7234 5555 1234 1234", "725778846")));


        //Вывести имя покупателя с самой длинной фамилией
        int maxLastNameLength = 0;
        Buyer buyerWithLongestLastName = null;

        for (int i = 0; i < buyers.size(); i++) {
            String lastName = buyers.get(i).getLastName();
            if (lastName.length() > maxLastNameLength) {
                maxLastNameLength = lastName.length();
                buyerWithLongestLastName = buyers.get(i);
            }
        }
        if (buyerWithLongestLastName != null) {
            System.out.println("Имя покупателя с самой длинной фамилией: " + buyerWithLongestLastName.getFirstName());
        }

        //Вывести адреса всех покупателей, у кого первая цифра номера кредитки 5
        for (Buyer buyer : buyers){
            if(buyer.getCreditCardNumber().startsWith("5")){
                System.out.println("Адрес покупателя с кредиткой с цифры 5: " + buyer.getAddress());
            }
        }

        //Вывести всех покупателей с отчеством "Евгеньевич"
        for (int i = 0; i < buyers.size(); i++){
            if(buyers.get(i).getPatronymic().equals("Евгеньевич")) {
                System.out.println("У него отчество Евгеньевич: " + buyers.get(i));
            }
        }
    }
}
