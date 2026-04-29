package CreationalDesignPatterns.AbstractFactoryPattern.BadCode;

/**
 * SINGLE "FAT" FACTORY (BAD DESIGN)
 * 
 * This factory tries to handle multiple products for multiple platforms.
 * 
 * WHY IT'S BAD:
 * 1. Repetitive Logic: Both methods repeat the same platform checks.
 * 2. Tight Coupling: This single class depends on every concrete UI class.
 * 3. Fragile/Mismatch Risk: The Client must pass the platform type to 
 *    EVERY call. If they pass ("Win") to createButton but ("Mac") 
 *    to createCheckbox, the UI family is broken.
 */
public class BadFatUIFactory {
    
    // Method 1: Repeated platform checks
    public Object createButton(String platform) {
        if (platform.equalsIgnoreCase("WINDOWS")) {
            return new BadAbstractWindowsButton();
        } else if (platform.equalsIgnoreCase("MAC")) {
            return new BadAbstractMacButton();
        }
        return null;
    }

    // Method 2: Repeated platform checks AGAIN
    public Object createCheckbox(String platform) {
        if (platform.equalsIgnoreCase("WINDOWS")) {
            return new BadAbstractWindowsCheckbox();
        } else if (platform.equalsIgnoreCase("MAC")) {
            return new BadAbstractMacCheckbox();
        }
        return null;
    }
}
