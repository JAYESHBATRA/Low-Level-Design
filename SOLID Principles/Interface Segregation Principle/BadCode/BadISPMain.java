public class BadISPMain {
    public static void main(String[] args) {
        BadISPSmartDevice printer = new BadISPOldPrinter();

        printer.print(); // Works fine

        System.out.println("Attempting to scan on an old printer...");
        try {
            printer.scan(); // CRASH!
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        /**
         * The problem: The client (BadISPMain) thinks 'printer' can scan 
         * because the interface says so. This leads to runtime errors 
         * and poor design.
         */
    }
}
