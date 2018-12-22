package observer.obser_self;

import observer.model.CurrentConditions;
import observer.obser_self.observer.Observer;
import observer.obser_self.observer.Subject;

import java.util.ArrayList;

/**
 * @author syz
 * @date 2018-12-22 15:44
 */
public class WeatherData  implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> obsevers;
    public WeatherData() {
        obsevers = new ArrayList<Observer>( );

    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData (float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        obsevers.add(observer);

    }

    public void removeObserver(Observer observer) {
        obsevers.remove(observer);

    }

    public void notifyObservers() {
        for (Observer o : obsevers) {
            o.update(getTemperature(),getPressure(),getHumidity());
        }

    }
}
