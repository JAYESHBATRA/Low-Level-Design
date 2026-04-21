/**
 * REFACTORED CLASS
 * 
 * Also delegates to the shared validator.
 */
public class GoodDRYEmployeeOnboarding {
    public void onboardEmployee(String name, String phone) {
        if (!GoodDRYValidator.isValidPhone(phone)) {
            System.out.println("Onboarding Error: Invalid phone number format.");
            return;
        }
        
        System.out.println("Onboarding employee " + name + " with phone " + phone);
    }
}
