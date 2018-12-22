package observer.obser_api;
/**
 * @author syz
 * @date 2018-12-22 16:05
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();

        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forcastConditions);
        weatherData.setData(12,13,14);
    }
}
