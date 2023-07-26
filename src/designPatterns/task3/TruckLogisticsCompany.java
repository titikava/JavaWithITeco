package designPatterns.task3;

public class TruckLogisticsCompany extends LogisticsCompany{
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
