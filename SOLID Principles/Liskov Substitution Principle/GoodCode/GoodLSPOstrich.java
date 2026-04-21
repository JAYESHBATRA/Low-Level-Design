/**
 * Ostrich now only inherits shared bird behavior.
 * Since it doesn't inherit from FlyingBird, it doesn't have a fly() 
 * method, eliminating the risk of a runtime crash.
 */
public class GoodLSPOstrich extends GoodLSPBird {
    // Inherits eat() but does NOT have a fly() method.
}
