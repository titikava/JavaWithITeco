package designPatterns.task4;

public class IOSMarketingPlanFactory extends MarketingPlanFactory{
    @Override
    public Subscription createSubscription() {
        return new IOSSubscription();
    }

    @Override
    public Tariff createTariff() {
        return new IOSTariff();
    }
}
