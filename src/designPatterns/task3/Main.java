package designPatterns.task3;

/**
 * Задача №3: Грузоперевозки (Со звёздочкой)
 * Компания на стадии стартапа осуществляля грузоперевозки материалов на грузовиках.
 * Но она активно разрослась и теперь нужно поддерживать и судоходные грузоперевозки.
 * Необходимо грамотно реализовать программу, чтобы она легко поддерживала новые расширения в транспорте.
 * У нас есть:
 * 1) Класс LogisticCompany - с методом planDelivery - внутри которого мы работали раньше с Truck - грузовик
 * planDelivery() {
 * Truck = new Truck();
 * truck.startDeparture();
 * }
 * 2) Теперь вместо грузовика может еще отправляться судно  Ship
 *  Реализуйте программу, в которой поддерживается отправка как морских суден, так грузовиков.
 *  Также программа легко масштабируется при появлении новых транспортов.
 * Подсказка: в задаче используется паттерн проектирования фабричный метод.
 */
public class Main {
    public static void main(String[] args) {
        LogisticsCompany truckLogisticsCompany = new TruckLogisticsCompany();
        truckLogisticsCompany.planDelivery();

        LogisticsCompany shipLogisticsCompany = new ShipLogisticsCompany();
        shipLogisticsCompany.planDelivery();
    }
}
