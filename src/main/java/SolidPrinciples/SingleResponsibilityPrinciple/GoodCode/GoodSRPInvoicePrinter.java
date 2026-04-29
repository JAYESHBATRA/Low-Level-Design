package SolidPrinciples.SingleResponsibilityPrinciple.GoodCode;

/**
 * GOOD CODE: InvoicePrinter
 *
 * This class has ONLY ONE responsibility: Handling the presentation logic.
 */
public class GoodSRPInvoicePrinter {
    public void print(GoodSRPInvoice invoice) {
        System.out.println("--- PRINTING INVOICE ---");
        System.out.println("Invoice ID  : " + invoice.getId());
        System.out.println("Amount      : " + invoice.getAmount());
        System.out.println("Total (+GST): " + invoice.calculateTotal());
    }
}
