package observer.obser_api;

import java.util.Observable;
import java.util.Observer;

/**
 * @author syz
 * @date 2018-12-22 15:15
 */
public class ForcastConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    public void display(){
        System.out.println(" tomorrow temperature : " + (this.temperature + 1));
        System.out.println(" tomorrow pressure : " + (this.pressure + 1));
        System.out.println(" tomorrow humidity : " + (this.humidity + 1));
    }

    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData.Data)arg).temperature;
        this.pressure = ((WeatherData.Data)arg).pressure;
        this.humidity = ((WeatherData.Data)arg).humidity;
        display();

    }
}
