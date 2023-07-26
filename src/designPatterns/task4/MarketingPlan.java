package designPatterns.task4;

public class MarketingPlan {
    private Subscription subscription;
    private Tariff tariff;

    public void setupPlan(MarketingPlanFactory factory) {
        subscription = factory.createSubscription();
        subscription.printInfo();

        tariff = factory.createTariff();
        tariff.printPlan();
    }
}
