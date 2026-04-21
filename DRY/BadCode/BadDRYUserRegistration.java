/**
 * VIOLATION OF DRY (Don't Repeat Yourself)
 * 
 * This class has its own copy of phone validation logic.
 */
public class BadDRYUserRegistration {
    public void registerUser(String name, String phone) {
        // Redundant Logic: Phone validation
        if (phone.length() != 10 || !phone.matches("\\d+")) {
            System.out.println("Registration Error: Invalid phone number format.");
            return;
        }
        
        System.out.println("Registering user " + name + " with phone " + phone);
    }
}
