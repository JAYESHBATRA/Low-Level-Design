
/**
 * VIOLATION: Open-Closed Principle
 * This class handles multiple payment methods using conditional logic (if-else).
 * Every time a new payment method is added, this class must be modified.
 */
public class BadPaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing Credit Card Payment of $" + amount);
            // Logic for Credit Card (validation, gateway call, etc.)
        } else if (paymentType.equalsIgnoreCase("UPI")) {
            System.out.println("Processing UPI Payment of $" + amount);
            // Logic for UPI (QR scanning, pin validation, etc.)
        } else if (paymentType.equalsIgnoreCase("PayPal")) {
            System.out.println("Processing PayPal Payment of $" + amount);
            // Logic for PayPal
        } else {
            System.out.println("Invalid Payment Type");
        }
    }
}
