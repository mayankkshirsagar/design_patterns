package patterns.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paying amount via credit card : " + amount + " via card " + cardNumber);
    }
}
