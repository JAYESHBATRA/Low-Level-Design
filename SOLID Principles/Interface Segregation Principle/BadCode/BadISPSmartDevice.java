/**
 * FAT INTERFACE (VIOLATION)
 * 
 * This interface combines multiple unrelated responsibilities.
 * Any class implementing this is FORCED to define all three methods.
 */
public interface BadISPSmartDevice {
    void print();
    void scan();
    void fax();
}
