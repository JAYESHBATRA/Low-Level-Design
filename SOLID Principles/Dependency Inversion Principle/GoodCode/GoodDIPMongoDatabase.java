/**
 * LOW-LEVEL MODULE (DETAILS)
 */
public class GoodDIPMongoDatabase implements GoodDIPDatabase {
    @Override
    public void saveData(String data) {
        System.out.println("Storing data in MongoDB: " + data);
    }
}
