/**
 * FLUENT BUILDER (GOOD CODE)
 * 
 * This class uses an internal static Builder to construct a User object.
 * 
 * BENEFITS:
 * 1. Readability: The creation code reads like a sentence.
 * 2. Immutability: The User class attributes are 'final', and there are no setters.
 * 3. Flexibility: You can set as few or as many optional params as you want.
 */
public class GoodBuilderUser {
    // All fields are final - once built, they cannot change (Immutability)
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;
    private final boolean isPremium;

    // Private constructor ensures the object can ONLY be created via the Builder
    private GoodBuilderUser(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.isPremium = builder.isPremium;
    }

    // Static method to start the building process
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return String.format("User: %s %s, Age: %d, Phone: %s, Address: %s, Premium: %b", 
            firstName, lastName, age, phone, address, isPremium);
    }

    // --- INTERNAL BUILDER CLASS ---
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;
        private boolean isPremium;

        // Methods for setting attributes return 'this' to allow chaining
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder isPremium(boolean isPremium) {
            this.isPremium = isPremium;
            return this;
        }

        // The final build method that returns the immutable GoodUser object
        public GoodBuilderUser build() {
            // We could add validation logic here (e.g., ensure required fields are set)
            if (firstName == null || lastName == null) {
                throw new IllegalStateException("First name and Last name are required.");
            }
            return new GoodBuilderUser(this);
        }
    }
}
