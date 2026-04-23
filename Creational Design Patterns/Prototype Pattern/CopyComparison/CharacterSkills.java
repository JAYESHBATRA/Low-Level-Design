/**
 * A helper class representing a list of skills.
 * This is a "Reference Type" object.
 */
public class CharacterSkills {
    private String skillName;

    public CharacterSkills(String skillName) {
        this.skillName = skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    @Override
    public String toString() {
        return skillName;
    }
}
