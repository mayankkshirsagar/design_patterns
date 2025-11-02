package patterns.strategy;

public class ShoppingClient {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPaymentStrategy("132321-223123-123123"));
        shoppingCart.checkout(500);

        shoppingCart.setPaymentStrategy(new PayPalPaymentStrategy("abc@gmail.com"));
        shoppingCart.checkout(1000);
    }
}
