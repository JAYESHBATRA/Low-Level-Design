/**
 * UNSTABLE UI SERVICE
 * 
 * This service uses a Single Factory, but since it's not an Abstract 
 * Factory, the service is still responsible for managing consistency.
 */
public class BadAbstractUIService {
    private final BadFatUIFactory factory = new BadFatUIFactory();

    public void renderDashboard(String platform) {
        System.out.println("--- Rendering Dashboard using Bad Fat Factory ---");

        /**
         * THE PROBLEM:
         * We have to pass the 'platform' string to EVERY method.
         * If there's a logic error, we can accidentally create a 
         * Windows Button and a Mac Checkbox. 
         * 
         * The family is NOT guaranteed by the design.
         */
        
        // 1. Create Button
        Object btnObj = factory.createButton(platform);
        
        // 2. Create Checkbox
        Object chkObj = factory.createCheckbox(platform);

        // Manual casting (another downside of this bad design)
        if (btnObj instanceof BadAbstractWindowsButton) {
            ((BadAbstractWindowsButton) btnObj).paint();
        } else if (btnObj instanceof BadAbstractMacButton) {
            ((BadAbstractMacButton) btnObj).paint();
        }

        if (chkObj instanceof BadAbstractWindowsCheckbox) {
            ((BadAbstractWindowsCheckbox) chkObj).paint();
        } else if (chkObj instanceof BadAbstractMacCheckbox) {
            ((BadAbstractMacCheckbox) chkObj).paint();
        }
    }
}
