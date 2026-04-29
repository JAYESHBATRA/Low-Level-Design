package SolidPrinciples.SingleResponsibilityPrinciple.BadCode;

/**
 * VIOLATION OF SINGLE RESPONSIBILITY PRINCIPLE (SRP)
 *
 * This class has multiple reasons to change:
 * 1. Business Logic (calculating total)
 * 2. Presentation Logic (printing invoice)
 * 3. Persistence Logic (saving to database)
 */
public class BadSRPInvoice {
    private int id;
    private double amount;

    public BadSRPInvoice(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.18; 
    }

    public void printInvoice() {
        System.out.println("--- INVOICE ---");
        System.out.println("ID: " + id);
        System.out.println("Total: " + calculateTotal());
    }

    public void saveToDatabase() {
        System.out.println("Saving Invoice #" + id + " to SQL Database...");
    }
}
