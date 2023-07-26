package designPatterns.task3;

abstract class LogisticsCompany {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.startDeparture();
    }

    protected abstract Transport createTransport();
}
