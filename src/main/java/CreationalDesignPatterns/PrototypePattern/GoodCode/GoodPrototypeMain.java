package CreationalDesignPatterns.PrototypePattern.GoodCode;

public class GoodPrototypeMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println("Initializing Prototype...");
        // This is the ONLY heavy call
        GoodGameCharacter warriorPrototype = new GoodGameCharacter("Warrior", "Sword", 100);

        System.out.println("\nCloning Army...");
        // Instant duplication
        GoodGameCharacter c1 = warriorPrototype.clone();
        GoodGameCharacter c2 = warriorPrototype.clone();
        
        // We can even customize the clones easily!
        GoodGameCharacter c3 = warriorPrototype.clone();
        c3.setWeapon("Axe");

        long endTime = System.currentTimeMillis();

        System.out.println("\nArmy Creation Complete:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\nTotal Time Taken: " + (endTime - startTime) + "ms");
        
        /**
         * SUCCESS:
         * We created 4 characters but only waited 1 second total.
         * The clones were created at memory speed.
         */
    }
}
