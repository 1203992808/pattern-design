package observer.obser_self;

import observer.obser_self.observer.Observer;

/**
 * @author syz
 * @date 2018-12-22 15:40
 */
public class ForcastConditions implements Observer{
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
        System.out.println(" tomorrow temperature : " + (this.temperature + 1));
        System.out.println(" tomorrow pressure : " + (this.pressure + 1));
        System.out.println(" tomorrow humidity : " + (this.humidity + 1));
    }

}
