
/**
 * Context Class: PaymentService
 * This class uses the strategy interface to process payments.
 * It remains unaware of the specific implementation of the strategy.
 */
public class PaymentService {
    private PaymentStrategy strategy;

    // The strategy is injected via constructor or setter
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected!");
            return;
        }
        strategy.pay(amount);
    }
}
