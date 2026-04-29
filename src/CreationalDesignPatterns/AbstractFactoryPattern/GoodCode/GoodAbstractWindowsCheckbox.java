package CreationalDesignPatterns.AbstractFactoryPattern.GoodCode;

/**
 * CONCRETE PRODUCT B1
 * Windows implementation of the Checkbox.
 */
public class GoodAbstractWindowsCheckbox implements GoodAbstractCheckbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows Style Checkbox.");
    }
}
