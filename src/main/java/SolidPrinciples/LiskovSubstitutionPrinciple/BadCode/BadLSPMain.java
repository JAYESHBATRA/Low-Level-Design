package SolidPrinciples.LiskovSubstitutionPrinciple.BadCode;

import java.util.ArrayList;
import java.util.List;

public class BadLSPMain {
    public static void main(String[] args) {
        List<BadLSPBird> birds = new ArrayList<>();
        birds.add(new BadLSPBird()); // A generic bird
        birds.add(new BadLSPOstrich()); // An ostrich

        System.out.println("Processing birds...");
        try {
            for (BadLSPBird bird : birds) {
                bird.eat(); // This part is fine
                bird.fly(); // This will CRASH for Ostrich
            }
        } catch (Exception e) {
            System.out.println("CRASH! " + e.getMessage());
            System.out.println("This happens because Ostrich violated the LSP 'contract' of the Bird class.");
        }
    }
}
