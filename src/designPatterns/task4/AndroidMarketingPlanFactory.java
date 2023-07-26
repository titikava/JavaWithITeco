package designPatterns.task4;

public class AndroidMarketingPlanFactory extends MarketingPlanFactory{
    @Override
    public Subscription createSubscription() {
        return new AndroidSubscription();
    }

    @Override
    public Tariff createTariff() {
        return new AndroidTariff();
    }
}
