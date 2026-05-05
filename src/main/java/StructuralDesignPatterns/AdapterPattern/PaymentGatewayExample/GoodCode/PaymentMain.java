package StructuralDesignPatterns.AdapterPattern.PaymentGatewayExample.GoodCode;

public class PaymentMain {
    public static void main(String[] args) {
        System.out.println("--- Payment Gateway Adapter Demo ---");

        // 1. Using Stripe via Adapter
        StripeApi stripe = new StripeApi();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(100.0);

        // 2. Using PayPal via Adapter
        PayPalApi paypal = new PayPalApi();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(200.0);
        
        // 3. We can now treat both as the same type!
        PaymentProcessor[] processors = { stripeProcessor, paypalProcessor };
        System.out.println("\nProcessing batch payments:");
        for (PaymentProcessor p : processors) {
            p.processPayment(50.0);
        }
    }
}
