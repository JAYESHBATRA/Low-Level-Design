package CreationalDesignPatterns.PrototypePattern.CopyComparison;

public class CopyComparisonMain {
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 1: SHALLOW COPY ===");
        CharacterSkills sharedSkills = new CharacterSkills("Archery");
        ShallowCharacter originalShallow = new ShallowCharacter("Legolas", sharedSkills);
        ShallowCharacter clonedShallow = originalShallow.clone();

        System.out.println("Before modification:");
        System.out.println("Original: " + originalShallow);
        System.out.println("Clone:    " + clonedShallow);

        // Modifying the clone's skills
        clonedShallow.getSkills().setSkillName("Magic");

        System.out.println("\nAfter modification of Clone's skill:");
        System.out.println("Original: " + originalShallow); // ERROR: Original's skill changed too!
        System.out.println("Clone:    " + clonedShallow);
        System.out.println("Result: Both point to the same skills object.");


        System.out.println("\n\n=== SCENARIO 2: DEEP COPY ===");
        CharacterSkills deepSkills = new CharacterSkills("Archery");
        DeepCharacter originalDeep = new DeepCharacter("Legolas", deepSkills);
        DeepCharacter clonedDeep = originalDeep.clone();

        System.out.println("Before modification:");
        System.out.println("Original: " + originalDeep);
        System.out.println("Clone:    " + clonedDeep);

        // Modifying the clone's skills
        clonedDeep.getSkills().setSkillName("Magic");

        System.out.println("\nAfter modification of Clone's skill:");
        System.out.println("Original: " + originalDeep); // SUCCESS: Original's skill is still Archery
        System.out.println("Clone:    " + clonedDeep);
        System.out.println("Result: Both have independent skills objects.");
    }
}
