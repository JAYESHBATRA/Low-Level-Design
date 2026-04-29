package CreationalDesignPatterns.AbstractFactoryPattern.GoodCode;

/**
 * CONCRETE PRODUCT A2
 * MacOS implementation of the Button.
 */
public class GoodAbstractMacButton implements GoodAbstractButton {
    @Override
    public void paint() {
        System.out.println("Rendering a MacOS Style Button.");
    }
}
