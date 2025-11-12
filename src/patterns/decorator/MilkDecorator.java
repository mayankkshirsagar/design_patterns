package patterns.decorator;

public class MilkDecorator extends CoffeeDecorator {

    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }


    public String description() {
        return coffee.description() + " , milk";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 1;
    }
}
