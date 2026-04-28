
/**
 * Concrete Strategy: UPI
 * Implements specific payment logic for UPI (Unified Payments Interface).
 */
public class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI ID: " + upiId);
    }
}
