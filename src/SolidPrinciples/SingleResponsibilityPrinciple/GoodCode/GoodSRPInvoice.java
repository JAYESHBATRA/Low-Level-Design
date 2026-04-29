package SolidPrinciples.SingleResponsibilityPrinciple.GoodCode;

/**
 * ADHERING TO SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * This class is a simple Data Transfer Object (DTO) or Entity.
 * Its ONLY responsibility is to hold Invoice data and handle core business calculations.
 */
public class GoodSRPInvoice {
    private int id;
    private double amount;

    public GoodSRPInvoice(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public double calculateTotal() {
        return amount * 1.18;
    }
}
