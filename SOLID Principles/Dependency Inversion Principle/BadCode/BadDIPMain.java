public class BadDIPMain {
    public static void main(String[] args) {
        BadDIPUserSyncService service = new BadDIPUserSyncService();
        service.sync("{name: 'Jayesh', role: 'Developer'}");
        
        /**
         * PROBLEM:
         * We cannot change the database to MongoDB without opening 
         * BadDIPUserSyncService.java and changing the code.
         */
    }
}
