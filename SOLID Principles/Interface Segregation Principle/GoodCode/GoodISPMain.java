public class GoodISPMain {
    public static void main(String[] args) {
        // 1. Client only needs a Printer
        GoodISPPrinter simplePrinter = new GoodISPSimplePrinter();
        simplePrinter.print();

        // 2. Client needs a Multi-Function device
        GoodISPSmartPrinter smartPrinter = new GoodISPSmartPrinter();
        smartPrinter.print();
        smartPrinter.scan();
        smartPrinter.fax();

        /**
         * BENEFIT:
         * Now, a client that only has a reference to GoodISPPrinter 
         * will ONLY see the print() method. They aren't even aware 
         * that scan or fax exist, so they can't accidentally call 
         * them and cause a crash.
         */
    }
}
