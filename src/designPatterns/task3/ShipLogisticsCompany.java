package designPatterns.task3;

public class ShipLogisticsCompany extends LogisticsCompany{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
