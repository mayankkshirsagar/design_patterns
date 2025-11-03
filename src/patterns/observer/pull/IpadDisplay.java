package patterns.observer.pull;

public class IpadDisplay implements Observer {
    private final WeatherStation weatherStation;

    public IpadDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("ipad display temperature updated to : " + weatherStation.getTemperature());
    }
}
