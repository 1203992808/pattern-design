package strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        TravelStrategy airPlaneStrategy = new AirPlaneStrategy();
        PersonContext personContext = new PersonContext();
        personContext.setTravelStrategy(airPlaneStrategy);
        personContext.travel();

        TravelStrategy trainStrategy = new BicycleStrategy();
        personContext.setTravelStrategy(trainStrategy);
        personContext.travel();

        TravelStrategy bicycleStrategy = new BicycleStrategy();
        personContext.setTravelStrategy(bicycleStrategy);
        personContext.travel();

    }
}
