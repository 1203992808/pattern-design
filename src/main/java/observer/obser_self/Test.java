package observer.obser_self;

/**
 * @author syz
 * @date 2018-12-22 15:51
 */
public class Test {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(forcastConditions);
        weatherData.removeObserver(currentConditions);
        weatherData.setData(12,13,14);
    }
}
