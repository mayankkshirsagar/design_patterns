package patterns.observer.push;

public class WeatherAppMain {

    public static void main(String[] args) {
        Observer pdObserver = new PhoneDisplay();
        Observer wdObserver = new WindowDisplay();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(pdObserver);
        weatherStation.addObserver(wdObserver);

        weatherStation.setTemperature(10.01);
        weatherStation.setTemperature(11.01);
        weatherStation.setTemperature(12.01);
    }
}
