/**
 * CONCRETE FACTORY 1
 * 
 * This Factory is dedicated to the Windows family.
 * It is impossible for this factory to return a Mac component. 
 * This ensures consistency across the whole UI.
 */
public class GoodAbstractWindowsFactory implements GoodAbstractUIFactory {
    @Override
    public GoodAbstractButton createButton() {
        return new GoodAbstractWindowsButton();
    }

    @Override
    public GoodAbstractCheckbox createCheckbox() {
        return new GoodAbstractWindowsCheckbox();
    }
}
