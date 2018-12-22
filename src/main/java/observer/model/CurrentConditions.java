package observer.model;

/**
 * @author syz
 * @date 2018-12-22 15:15
 */
public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;
    public void update (float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println(" today temperature : " + this.temperature);
        System.out.println(" today pressure : " + this.pressure);
        System.out.println(" today humidity : " + this.humidity);
    }
}
