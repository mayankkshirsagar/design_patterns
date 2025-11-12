package patterns.decorator;

public class CoffeeMachine {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.description());
        System.out.println(coffee.getCost());
    }
}
