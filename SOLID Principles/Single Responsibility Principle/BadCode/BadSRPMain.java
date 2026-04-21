public class BadSRPMain {
    public static void main(String[] args) {
        // Using the un-packaged, uniquely named class
        BadSRPInvoice invoice = new BadSRPInvoice(101, 1000.0);

        invoice.printInvoice();
        invoice.saveToDatabase();
    }
}
