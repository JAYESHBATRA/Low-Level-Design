package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.GoodCode;

/**
 * Adaptee 2: PayPal (Uses sendMoney)
 */
public class PayPalApi {
    public void sendMoney(double amount) {
        System.out.println("Payment of $" + amount + " processed via PayPal.");
    }
}
