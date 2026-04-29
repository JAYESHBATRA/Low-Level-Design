package SolidPrinciples.DependencyInversionPrinciple.GoodCode;

/**
 * LOW-LEVEL MODULE (DETAILS)
 */
public class GoodDIPMySQLDatabase implements GoodDIPDatabase {
    @Override
    public void saveData(String data) {
        System.out.println("Storing data in MySQL: " + data);
    }
}
