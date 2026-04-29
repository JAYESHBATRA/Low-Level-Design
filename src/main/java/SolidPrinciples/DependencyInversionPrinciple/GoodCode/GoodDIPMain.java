package SolidPrinciples.DependencyInversionPrinciple.GoodCode;

public class GoodDIPMain {
    public static void main(String[] args) {
        // 1. Create the low-level dependencies
        GoodDIPDatabase mySql = new GoodDIPMySQLDatabase();
        GoodDIPDatabase mongo = new GoodDIPMongoDatabase();

        // 2. Inject MySQL into the service
        GoodDIPUserSyncService mySqlService = new GoodDIPUserSyncService(mySql);
        mySqlService.sync("{name: 'Jayesh', role: 'Developer'}");

        // 3. Inject MongoDB into the SAME service class without code changes
        GoodDIPUserSyncService mongoService = new GoodDIPUserSyncService(mongo);
        mongoService.sync("{name: 'Jayesh', role: 'Architect'}");

        /**
         * BENEFIT:
         * The GoodDIPUserSyncService is now perfectly decoupled.
         * It can work with any database as long as it follows the interface.
         */
    }
}
