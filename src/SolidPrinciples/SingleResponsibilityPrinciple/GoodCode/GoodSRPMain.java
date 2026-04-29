package SolidPrinciples.SingleResponsibilityPrinciple.GoodCode;

public class GoodSRPMain {
    public static void main(String[] args) {
        // 1. Create the data entity
        GoodSRPInvoice invoice = new GoodSRPInvoice(202, 2500.0);

        // 2. Use a specialized class for printing
        GoodSRPInvoicePrinter printer = new GoodSRPInvoicePrinter();
        printer.print(invoice);

        // 3. Use a specialized class for persistence
        GoodSRPInvoiceRepository repository = new GoodSRPInvoiceRepository();
        repository.save(invoice);
    }
}
