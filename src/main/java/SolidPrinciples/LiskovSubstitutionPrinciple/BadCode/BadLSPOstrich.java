package SolidPrinciples.LiskovSubstitutionPrinciple.BadCode;

/**
 * VIOLATION OF LISKOV SUBSTITUTION PRINCIPLE (LSP)
 * 
 * Ostrich is a Bird, so it inherits from BadLSPBird.
 * However, Ostriches cannot fly. 
 * 
 * By throwing an exception, we are breaking the "contract" of the 
 * base class. Any program expecting a Bird to fly will CRASH 
 * if it receives an Ostrich.
 */
public class BadLSPOstrich extends BadLSPBird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Error: Ostriches cannot fly!");
    }
}
