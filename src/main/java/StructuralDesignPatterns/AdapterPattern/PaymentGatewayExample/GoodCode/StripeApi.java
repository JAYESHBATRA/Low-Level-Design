package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.GoodCode;

/**
 * Adaptee 1: Stripe (Uses makePayment)
 */
public class StripeApi {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}
