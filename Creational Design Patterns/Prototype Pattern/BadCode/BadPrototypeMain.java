public class BadPrototypeMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Creating 3 characters from scratch
        System.out.println("Creating Army...");
        BadGameCharacter c1 = new BadGameCharacter("Warrior", "Sword", 100);
        BadGameCharacter c2 = new BadGameCharacter("Warrior", "Sword", 100);
        BadGameCharacter c3 = new BadGameCharacter("Warrior", "Sword", 100);

        long endTime = System.currentTimeMillis();

        System.out.println("\nArmy Creation Complete:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("\nTotal Time Taken: " + (endTime - startTime) + "ms");
        
        /**
         * THE PROBLEM:
         * We wasted 3 seconds because we re-initialized the same 
         * type of character 3 times.
         */
    }
}
