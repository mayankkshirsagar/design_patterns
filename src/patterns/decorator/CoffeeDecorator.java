package patterns.decorator;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String description() {
        return coffee.description();
    }

    public int getCost() {
        return coffee.getCost();
    }

}
