package strategy;

public class PersonContext {
    private TravelStrategy travelStrategy;
    public PersonContext(){
    }

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel(){
        travelStrategy.travelWay();
    }

}
