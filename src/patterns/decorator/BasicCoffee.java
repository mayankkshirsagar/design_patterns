package patterns.decorator;

public class BasicCoffee implements Coffee {

    @Override
    public String description() {
        return "basic coffee";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
