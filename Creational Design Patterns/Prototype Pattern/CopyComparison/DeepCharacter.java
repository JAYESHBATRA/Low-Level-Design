/**
 * DEEP COPY EXAMPLE
 * 
 * Manually copies the internal reference objects too.
 */
public class DeepCharacter implements Cloneable {
    private String name;
    private CharacterSkills skills;

    public DeepCharacter(String name, CharacterSkills skills) {
        this.name = name;
        this.skills = skills;
    }

    public CharacterSkills getSkills() {
        return skills;
    }

    @Override
    public DeepCharacter clone() {
        try {
            // 1. First, get a shallow copy
            DeepCharacter cloned = (DeepCharacter) super.clone();
            
            // 2. MANUALLY create a new instance of the reference fields (Deep Copy)
            // This ensures the original and the clone have their OWN skills objects.
            cloned.skills = new CharacterSkills(this.skills.toString());
            
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Character: " + name + ", Skills: [" + skills + "]";
    }
}
