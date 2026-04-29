package SolidPrinciples.DependencyInversionPrinciple.BadCode;

/**
 * LOW-LEVEL MODULE
 */
public class BadDIPMySQLDatabase {
    public void insert(String data) {
        System.out.println("Inserting data into MySQL: " + data);
    }
}
