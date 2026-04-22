/**
 * TELESCOPING CONSTRUCTOR (BAD CODE)
 * 
 * This class has many optional attributes.
 * To provide flexibility, the developer added many constructors.
 * 
 * WHY IT'S BAD:
 * 1. Hard to read: What do all those parameters mean in order?
 * 2. Fragile: If you add another attribute, the number of constructors grows exponentially.
 * 3. Boilerplate: Too much repetitive code.
 */
public class BadBuilderUser {
    private final String firstName;    // required
    private final String lastName;     // required
    private final int age;             // optional
    private final String phone;        // optional
    private final String address;      // optional
    private final boolean isPremium;   // optional

    // Constructor 1: Only required
    public BadBuilderUser(String firstName, String lastName) {
        this(firstName, lastName, 0, null, null, false);
    }

    // Constructor 2: Required + Age
    public BadBuilderUser(String firstName, String lastName, int age) {
        this(firstName, lastName, age, null, null, false);
    }

    // Constructor 3: Required + Age + Phone
    public BadBuilderUser(String firstName, String lastName, int age, String phone) {
        this(firstName, lastName, age, phone, null, false);
    }

    // ... This continues "Telescoping" ...

    // Final "Master" Constructor
    public BadBuilderUser(String firstName, String lastName, int age, String phone, String address, boolean isPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.isPremium = isPremium;
    }

    @Override
    public String toString() {
        return String.format("User: %s %s, Age: %d, Phone: %s, Address: %s, Premium: %b", 
            firstName, lastName, age, phone, address, isPremium);
    }
}
