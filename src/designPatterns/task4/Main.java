package designPatterns.task4;

/**
 * Задача №4: Мобильное приложение (Со звёздочкой)
 * Мы разрабатываем мобильное приложение для сайта доставки еды.
 * Нам необходимо поддержать две платформы - android  и iOS.
 * Для android существует форма подписки AndroidSubscription и AndroidTariff, для iOS - IOSSubscription и IOSTariff.
 * Нам необходимо создать общий класс MarketingPlan, в котором реализуется система подписок независимо от платформы.
 * В этом классе мы выводим всю информацию по текущему плану, в старой реализации поддерживалось только Anroid проиложение.
 * MarketingPlan {
 *        setupPlan() {
 *               Subscription subscription = new AndroidSubscription();
 *               subscription.printInfo();
 *               Tariff tariff = new AndroidTariff();
 *                tariff.printPlan();
 *        }
 *  }
 * Необходимо модернизировать систему для вывода информации о маркетинговом плане для текущей платформы - android или
 * iOS. И поддержать возможность масштабирования на новые платформы.
 * Подсказка: в данной задаче используется паттерн проектирования абстрактная фабрика.
 */
public class Main {
    public static void main(String[] args) {
        MarketingPlan marketingPlan = new MarketingPlan();

        // Создание маркетингового плана для Android
        MarketingPlanFactory androidFactory = new AndroidMarketingPlanFactory();
        marketingPlan.setupPlan(androidFactory);

        // Создание маркетингового плана для iOS
        MarketingPlanFactory iOSFactory = new IOSMarketingPlanFactory();
        marketingPlan.setupPlan(iOSFactory);
    }
}
