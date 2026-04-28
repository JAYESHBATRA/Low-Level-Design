
/**
 * Main Class: Demonstration
 * Shows how we can switch payment strategies at runtime without changing the PaymentService class.
 */
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Pay using Credit Card
        System.out.println("--- Scenario 1: Credit Card ---");
        paymentService.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        paymentService.processPayment(250.00);

        // Switch to UPI at runtime
        System.out.println("\n--- Scenario 2: UPI ---");
        paymentService.setPaymentStrategy(new UPIPayment("john@okaxis"));
        paymentService.processPayment(150.00);

        // We can easily add a new strategy (e.g. PayPal) without modifying existing classes.
    }
}
