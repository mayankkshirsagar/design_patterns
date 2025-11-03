package patterns.observer.pull;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private final List<Observer> observerList = new ArrayList<>();

    private double temperature;


    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObserver();
    }
}
