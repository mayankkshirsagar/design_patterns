package patterns.observer.push;

public class PhoneDisplay implements Observer {

    @Override
    public void update(double temperature) {
        System.out.println("PhoneDisplay temperature updated : " + temperature);
    }
}
