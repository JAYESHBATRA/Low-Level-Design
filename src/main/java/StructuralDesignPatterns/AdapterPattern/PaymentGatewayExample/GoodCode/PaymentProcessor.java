package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.GoodCode;

/**
 * Target Interface: What our application expects.
 */
public interface PaymentProcessor {
    void processPayment(double amount);
}
