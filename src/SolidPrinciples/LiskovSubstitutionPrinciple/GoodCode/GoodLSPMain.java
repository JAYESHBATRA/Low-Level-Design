package SolidPrinciples.LiskovSubstitutionPrinciple.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class GoodLSPMain {
    public static void main(String[] args) {
        // 1. Handling all birds for shared behavior
        List<GoodLSPBird> allBirds = new ArrayList<>();
        allBirds.add(new GoodLSPSparrow());
        allBirds.add(new GoodLSPOstrich());

        System.out.println("Processing all birds (Shared Behavior):");
        for (GoodLSPBird bird : allBirds) {
            bird.eat(); // Safe for all birds
        }

        // 2. Handling ONLY flying birds for specific behavior
        List<GoodLSPFlyingBird> flyingBirds = new ArrayList<>();
        flyingBirds.add(new GoodLSPSparrow());
        // flyingBirds.add(new GoodLSPOstrich()); // COMPILER ERROR! This is good.

        System.out.println("\nProcessing flying birds (Specific Behavior):");
        for (GoodLSPFlyingBird bird : flyingBirds) {
            bird.fly(); // Safe because the type guarantees it
        }
    }
}
