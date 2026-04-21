public class BadDRYMain {
    public static void main(String[] args) {
        BadDRYUserRegistration registration = new BadDRYUserRegistration();
        BadDRYEmployeeOnboarding onboarding = new BadDRYEmployeeOnboarding();

        System.out.println("--- DRY VIOLATION DEMO ---");
        
        registration.registerUser("Jayesh", "1234567890"); // Valid
        onboarding.onboardEmployee("Batra", "98765");     // Invalid (Detected)

        /**
         * The issue here isn't that it doesn't work. The issue is that the 
         * logic "if (phone.length() != 10 || !phone.matches(\"\\\\d+\"))" 
         * exists in two places. If the company decides to allow 
         * international numbers starting with '+', we must find every 
         * single occurrence of this and update it.
         */
    }
}
