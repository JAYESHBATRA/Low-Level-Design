package CreationalDesignPatterns.AbstractFactoryPattern.GoodCode;

/**
 * CONCRETE FACTORY 2
 * 
 * This Factory is dedicated to the MacOS family.
 * It encapsulates the knowledge of how to create Mac-specific 
 * buttons and checkboxes.
 */
public class GoodAbstractMacOSFactory implements GoodAbstractUIFactory {
    @Override
    public GoodAbstractButton createButton() {
        return new GoodAbstractMacButton();
    }

    @Override
    public GoodAbstractCheckbox createCheckbox() {
        return new GoodAbstractMacCheckbox();
    }
}
