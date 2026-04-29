package CreationalDesignPatterns.BuilderPattern.GoodCode;

public class GoodBuilderMain {
    public static void main(String[] args) {
        /**
         * THE FLUENT API BENEFIT:
         * Notice how clear this creation code is. 
         * No more mystery nulls. 
         * It reads like a natural language sentence.
         */
        GoodBuilderUser user = GoodBuilderUser.builder()
            .firstName("John")
            .lastName("Doe")
            .age(25)
            .isPremium(true)
            .build(); // Only set what we need!

        System.out.println("--- Good Builder Approach ---");
        System.out.println(user);

        // Another example: different parameters, same clean code
        GoodBuilderUser minimalUser = GoodBuilderUser.builder()
            .firstName("Jane")
            .lastName("Smith")
            .build();
            
        System.out.println(minimalUser);
    }
}
