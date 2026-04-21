/**
 * This class only implements what it actually supports.
 * It is NOT forced to implement scan() or fax().
 */
public class GoodISPSimplePrinter implements GoodISPPrinter {
    @Override
    public void print() {
        System.out.println("Simple Printer is printing...");
    }
}
