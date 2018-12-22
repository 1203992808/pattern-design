package observer.obser_self;

import observer.obser_self.observer.Observer;

/**
 * @author syz
 * @date 2018-12-22 15:35
 */
public class CurrentConditions implements Observer {
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
