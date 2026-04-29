package CreationalDesignPatterns.AbstractFactoryPattern.GoodCode;

/**
 * DECOUPLED UI SERVICE
 * 
 * This service handles the rendering logic for the dashboard.
 * 
 * THE BENEFIT:
 * 1. Stability: This class does NOT care if it's running on Windows or Mac.
 * 2. Consistency: It's impossible to create a "mismatched" UI because the 
 *    factory guarantees a consistent family of objects.
 * 3. Scalability: Adding a 'LinuxFactory' requires zero changes to this class.
 */
public class GoodAbstractUIService {
    private final GoodAbstractUIFactory factory;

    public GoodAbstractUIService(GoodAbstractUIFactory factory) {
        this.factory = factory;
    }

    public void renderDashboard() {
        System.out.println("--- Rendering Dashboard in Good UI Service ---");

        // The service just asks the factory for 'a' button and 'a' checkbox.
        // It doesn't need to know WHICH concrete class it gets.
        GoodAbstractButton button = factory.createButton();
        GoodAbstractCheckbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}
