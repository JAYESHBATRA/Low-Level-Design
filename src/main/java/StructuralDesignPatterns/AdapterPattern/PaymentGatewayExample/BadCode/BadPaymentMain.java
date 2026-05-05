package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.BadCode;

class StripeApi {
    public void makePayment(double amount) {
        System.out.println("Processing via Stripe...");
    }
}

class PayPalApi {
    public void sendMoney(double amount) {
        System.out.println("Processing via PayPal...");
    }
}

/**
 * VIOLATION: Tight Coupling.
 * The Checkout service must know the specific method names for every provider.
 */
class CheckoutService {
    public void checkout(String provider, double amount) {
        if (provider.equals("Stripe")) {
            new StripeApi().makePayment(amount);
        } else if (provider.equals("PayPal")) {
            new PayPalApi().sendMoney(amount);
        }
        // PROBLEM: If we add PayTM, we must modify this class.
    }
}

public class BadPaymentMain {
    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();
        checkout.checkout("Stripe", 100.0);
    }
}
