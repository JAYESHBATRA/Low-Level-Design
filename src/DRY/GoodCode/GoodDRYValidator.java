package DRY.GoodCode;

/**
 * CENTRALIZED LOGIC (ADHERING TO DRY)
 * 
 * This class is the "single source of truth" for all input validation.
 */
public class GoodDRYValidator {
    public static boolean isValidPhone(String phone) {
        // The logic is defined ONCE here.
        return phone != null && phone.length() == 10 && phone.matches("\\d+");
    }
}
