package observer.model;

/**
 * @author syz
 * @date 2018-12-22 15:25
 */
public class Test {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(12,13,14);
    }
}
