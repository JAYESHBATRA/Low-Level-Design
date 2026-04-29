package CreationalDesignPatterns.AbstractFactoryPattern.BadCode;

public class BadAbstractMain {
    public static void main(String[] args) {
        BadAbstractUIService service = new BadAbstractUIService();
        
        // Render for Windows
        service.renderDashboard("WINDOWS");
        
        System.out.println();
        
        // Render for Mac
        service.renderDashboard("MAC");
        
        /**
         * Even though this works, the UIService is incredibly fragile. 
         * The family of objects (Button + Checkbox) is not enforced 
         * by the code—only by our manual if-else logic.
         */
    }
}
