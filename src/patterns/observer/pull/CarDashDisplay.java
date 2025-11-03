package patterns.observer.pull;


public class CarDashDisplay implements Observer {

    private final WeatherStation weatherStation;

    public CarDashDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("car display temperature updated to : " + weatherStation.getTemperature());
    }
}
