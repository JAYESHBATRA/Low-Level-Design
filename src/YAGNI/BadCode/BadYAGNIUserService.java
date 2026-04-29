package YAGNI.BadCode;

/**
 * VIOLATION OF YAGNI (You Ain't Gonna Need It)
 * 
 * The only current requirement is to save a user.
 * However, the developer has added multiple speculative features 
 * "just in case" they are needed later.
 */
public class BadYAGNIUserService {
    
    // CURRENT REQUIREMENT
    public void saveUser(String username) {
        System.out.println("Saving user: " + username);
    }

    // SPECULATIVE EXTRA - NOT NEEDED YET
    public void exportUserToJson(String username) {
        System.out.println("Exporting user to JSON... { \"user\": \"" + username + "\" }");
    }

    // SPECULATIVE EXTRA - NOT NEEDED YET
    public void softDeleteUser(String username) {
        System.out.println("Marking user as deleted in the database (soft-delete): " + username);
    }

    // SPECULATIVE EXTRA - NOT NEEDED YET
    public void getUserVersionHistory(String username) {
        System.out.println("Retrieving version history for: " + username);
    }
}
