/**
 * A device that actually supports all functions.
 * It implements all three specific interfaces.
 */
public class GoodISPSmartPrinter implements GoodISPPrinter, GoodISPScanner, GoodISPFaxer {
    @Override
    public void print() {
        System.out.println("Smart Printer is printing...");
    }

    @Override
    public void scan() {
        System.out.println("Smart Printer is scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Smart Printer is faxing...");
    }
}
