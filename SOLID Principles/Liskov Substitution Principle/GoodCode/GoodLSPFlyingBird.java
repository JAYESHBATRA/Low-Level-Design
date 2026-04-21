/**
 * SPECIALIZED SUBCLASS
 * 
 * Only birds that can actually fly should inherit from this.
 */
public class GoodLSPFlyingBird extends GoodLSPBird {
    public void fly() {
        System.out.println("This bird is flying!");
    }
}
