public class BadBuilderMain {
    public static void main(String[] args) {
        /**
         * THE READABILITY PROBLEM:
         * Looking at the call below, it's impossible to know what 
         * '25', 'null', 'null', and 'true' represent without checking 
         * the BadUser class.
         * 
         * This is often called "Mystery Nulls" or "Mystery Booleans".
         */
        BadBuilderUser user = new BadBuilderUser(
            "John", 
            "Doe", 
            25, 
            null, 
            null, 
            true
        );

        System.out.println("--- Bad Builder Approach ---");
        System.out.println(user);
    }
}
