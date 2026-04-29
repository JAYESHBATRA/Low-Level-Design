package CreationalDesignPatterns.AbstractFactoryPattern.GoodCode;

/**
 * THE CLIENT CODE
 * 
 * Notice how this class only works with the Abstract Factory and 
 * Abstract Product interfaces. It is never coupled to 'WindowsButton' 
 * or 'MacOSFactory'. This makes the system extremely flexible 
 * and consistent.
 */
public class GoodAbstractMain {
    public static void main(String[] args) {
        // 1. Scene: Rendering for Windows
        // In a real app, this choice might be made in a config file or detected at startup.
        System.out.println("Configuring for Windows...");
        GoodAbstractUIFactory winFactory = new GoodAbstractWindowsFactory();
        GoodAbstractUIService winService = new GoodAbstractUIService(winFactory);
        winService.renderDashboard();

        System.out.println();

        // 2. Scene: Rendering for MacOS
        System.out.println("Configuring for MacOS...");
        GoodAbstractUIFactory macFactory = new GoodAbstractMacOSFactory();
        GoodAbstractUIService macService = new GoodAbstractUIService(macFactory);
        macService.renderDashboard();
    }
}
