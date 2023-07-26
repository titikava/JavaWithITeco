package designPatterns.task3;

public class Ship extends Transport{
    @Override
    public void startDeparture() {
        System.out.println("Судно отправляется");
    }
}
