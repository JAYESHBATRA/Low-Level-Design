package DRY.GoodCode;

public class GoodDRYMain {
    public static void main(String[] args) {
        GoodDRYUserRegistration registration = new GoodDRYUserRegistration();
        GoodDRYEmployeeOnboarding onboarding = new GoodDRYEmployeeOnboarding();

        System.out.println("--- DRY COMPLIANT DEMO ---");
        
        registration.registerUser("Jayesh", "1234567890"); // Uses GoodDRYValidator
        onboarding.onboardEmployee("Batra", "98765");     // Uses GoodDRYValidator

        /**
         * BENEFIT:
         * Now the knowledge of "what a valid phone looks like" is 
         * defined only once. If we need to change it, we only change 
         * GoodDRYValidator.java, and both services stay in sync!
         */
    }
}
