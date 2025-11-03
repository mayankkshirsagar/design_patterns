package patterns.observer.pull;

public class WeatherAppMain {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer cdObserver = new CarDashDisplay(weatherStation);
        Observer ipadObserver = new IpadDisplay(weatherStation);

        weatherStation.addObserver(cdObserver);
        weatherStation.addObserver(ipadObserver);

        weatherStation.setTemperature(10.01);
        weatherStation.setTemperature(13.11);

        // we can also use the observer to fetch data directly in case of a refresh needed on observer
        cdObserver.update();
        ipadObserver.update();
    }
}
