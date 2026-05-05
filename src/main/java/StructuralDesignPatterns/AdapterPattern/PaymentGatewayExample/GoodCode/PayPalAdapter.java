package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.GoodCode;

/**
 * Adapter for PayPal
 */
public class PayPalAdapter implements PaymentProcessor {
    private PayPalApi payPalApi;

    public PayPalAdapter(PayPalApi payPalApi) {
        this.payPalApi = payPalApi;
    }

    @Override
    public void processPayment(double amount) {
        // Translate application call to PayPal-specific call
        payPalApi.sendMoney(amount);
    }
}
