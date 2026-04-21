/**
 * VIOLATION OF INTERFACE SEGREGATION PRINCIPLE (ISP)
 * 
 * This is a simple printer. It CANNOT scan or fax.
 * However, because it implements BadISPSmartDevice, it is FORCED 
 * to provide implementations for scan() and fax().
 */
public class BadISPOldPrinter implements BadISPSmartDevice {
    @Override
    public void print() {
        System.out.println("Old Printer is printing...");
    }

    @Override
    public void scan() {
        // ERROR: This device doesn't have a scanner!
        throw new UnsupportedOperationException("Scan not supported.");
    }

    @Override
    public void fax() {
        // ERROR: This device doesn't have a fax module!
        throw new UnsupportedOperationException("Fax not supported.");
    }
}
