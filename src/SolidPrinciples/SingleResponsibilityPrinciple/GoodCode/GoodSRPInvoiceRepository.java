package SolidPrinciples.SingleResponsibilityPrinciple.GoodCode;

/**
 * GOOD CODE: InvoiceRepository
 *
 * This class has ONLY ONE responsibility: Handling the persistence logic.
 */
public class GoodSRPInvoiceRepository {
    public void save(GoodSRPInvoice invoice) {
        System.out.println("--- PERSISTING INVOICE ---");
        System.out.println("Saving Invoice #" + invoice.getId() + " to SQL Database...");
    }
}
