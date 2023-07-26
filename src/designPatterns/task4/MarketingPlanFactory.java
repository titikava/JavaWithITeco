package designPatterns.task4;

abstract class MarketingPlanFactory {
    public abstract Subscription createSubscription();
    public abstract Tariff createTariff();
}
