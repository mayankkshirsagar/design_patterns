package patterns.observer.push;

public class WindowDisplay implements Observer {

    @Override
    public void update(double temperature) {
        System.out.println("Window display temperature updated : " + temperature);
    }
}
