package patterns.decorator;

public class SugarDecorator extends CoffeeDecorator {

    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }

    public String description() {
        return coffee.description() + " , sugar";
    }

    public int getCost() {
        return coffee.getCost() + 1;
    }
}
