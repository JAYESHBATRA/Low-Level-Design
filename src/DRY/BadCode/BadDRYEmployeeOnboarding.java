package DRY.BadCode;

/**
 * VIOLATION OF DRY (Don't Repeat Yourself)
 * 
 * This class also has the exact same copy of phone validation logic.
 * If the validation rule changes, we have to update two places.
 */
public class BadDRYEmployeeOnboarding {
    public void onboardEmployee(String name, String phone) {
        // Redundant Logic: Same phone validation logic as UserRegistration
        if (phone.length() != 10 || !phone.matches("\\d+")) {
            System.out.println("Onboarding Error: Invalid phone number format.");
            return;
        }
        
        System.out.println("Onboarding employee " + name + " with phone " + phone);
    }
}
