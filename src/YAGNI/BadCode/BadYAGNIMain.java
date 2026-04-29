package YAGNI.BadCode;

public class BadYAGNIMain {
    public static void main(String[] args) {
        BadYAGNIUserService service = new BadYAGNIUserService();
        
        // This is the only method we actually need.
        service.saveUser("jayesh_batra");

        /**
         * LOOK AT THE SERVICE CLASS:
         * It has 3 other methods that are completely unused. 
         * - They take up space.
         * - They had to be tested.
         * - They might have bugs.
         * - And we might NEVER actually use them.
         */
    }
}
