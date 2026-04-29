package BehaviouralDesignPatterns.StrategyPattern.GoodCode;

/**
 * Concrete Strategy: Credit Card
 * Implements specific payment logic for Credit Cards.
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card (" + cardNumber + ")");
    }
}
