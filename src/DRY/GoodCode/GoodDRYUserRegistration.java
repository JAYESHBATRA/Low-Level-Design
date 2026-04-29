package DRY.GoodCode;

/**
 * REFACTORED CLASS
 * 
 * Instead of having private validation logic, this class 
 * delegates to the GoodDRYValidator utility.
 */
public class GoodDRYUserRegistration {
    public void registerUser(String name, String phone) {
        if (!GoodDRYValidator.isValidPhone(phone)) {
            System.out.println("Registration Error: Invalid phone number format.");
            return;
        }
        
        System.out.println("Registering user " + name + " with phone " + phone);
    }
}
