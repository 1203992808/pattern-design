package observer.model;

/**
 * @author syz
 * @date 2018-12-22 15:12
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }
    public void setData (float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
    public void dataChange() {
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }
}
