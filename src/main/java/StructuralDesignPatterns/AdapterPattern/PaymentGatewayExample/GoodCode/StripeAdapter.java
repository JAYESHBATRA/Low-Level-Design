package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.GoodCode;

/**
 * Adapter for Stripe
 */
public class StripeAdapter implements PaymentProcessor {
    private StripeApi stripeApi;

    public StripeAdapter(StripeApi stripeApi) {
        this.stripeApi = stripeApi;
    }

    @Override
    public void processPayment(double amount) {
        // Translate application call to Stripe-specific call
        stripeApi.makePayment(amount);
    }
}
