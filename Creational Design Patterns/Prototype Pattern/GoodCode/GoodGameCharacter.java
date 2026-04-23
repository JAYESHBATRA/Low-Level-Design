/**
 * PROTOTYPE CLONING (GOOD CODE)
 * 
 * By implementing Cloneable, we can duplicate the object at the memory level.
 */
public class GoodGameCharacter implements Cloneable {
    private String type;
    private String weapon;
    private int health;

    public GoodGameCharacter(String type, String weapon, int health) {
        // Simulating heavy initialization exactly once
        System.out.println("--- Loading heavy assets for: " + type + " ---");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.type = type;
        this.weapon = weapon;
        this.health = health;
    }

    // Setters allow us to customize the clone after it's created
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * The Clone Method
     * This creates a shallow copy of the object instantly.
     */
    @Override
    public GoodGameCharacter clone() {
        try {
            return (GoodGameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Character: " + type + ", Weapon: " + weapon + ", Health: " + health;
    }
}
