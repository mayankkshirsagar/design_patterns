package patterns.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {

    private final String emailId;

    public PayPalPaymentStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paying amount via paypal : " + amount + " via account id : " + emailId);
    }
}
