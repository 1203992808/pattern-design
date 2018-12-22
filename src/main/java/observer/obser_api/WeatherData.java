package observer.obser_api;

import observer.model.CurrentConditions;

import java.util.Observable;

/**
 * @author syz
 * @date 2018-12-22 15:12
 */
public class WeatherData extends Observable{
    private float temperature;
    private float pressure;
    private float humidity;


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
        dataChange();
    }
    public void dataChange() {
        this.setChanged();
        this.notifyObservers(new Data(getTemperature(),getPressure(),getHumidity()));

    }
    public class Data{
         float temperature;
         float pressure;
         float humidity;

        public Data(float temperature, float pressure, float humidity) {
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
        }
    }

}
