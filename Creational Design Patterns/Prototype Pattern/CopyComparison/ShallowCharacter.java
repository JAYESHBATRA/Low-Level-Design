/**
 * SHALLOW COPY EXAMPLE
 * 
 * Uses Java's default super.clone() behavior.
 */
public class ShallowCharacter implements Cloneable {
    private String name;
    private CharacterSkills skills; // This is a reference to another object

    public ShallowCharacter(String name, CharacterSkills skills) {
        this.name = name;
        this.skills = skills;
    }

    public CharacterSkills getSkills() {
        return skills;
    }

    @Override
    public ShallowCharacter clone() {
        try {
            // super.clone() only copies primitive values and the REFERENCE value of objects.
            // It does NOT create a new instance of 'skills'.
            return (ShallowCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Character: " + name + ", Skills: [" + skills + "]";
    }
}
