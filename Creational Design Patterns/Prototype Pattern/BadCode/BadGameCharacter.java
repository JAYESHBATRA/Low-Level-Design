/**
 * EXPENSIVE INITIALIZATION (BAD CODE)
 * 
 * Imagine this character needs to load 3D models, textures, 
 * and sounds every time it is created.
 */
public class BadGameCharacter {
    private String type;
    private String weapon;
    private int health;

    public BadGameCharacter(String type, String weapon, int health) {
        // Simulating heavy initialization (e.g., loading assets)
        System.out.println("--- Loading heavy assets for: " + type + " ---");
        try {
            Thread.sleep(1000); // Wait 1 second (simulated bottleneck)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        this.type = type;
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Character: " + type + ", Weapon: " + weapon + ", Health: " + health;
    }
}
