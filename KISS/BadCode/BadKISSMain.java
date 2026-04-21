public class BadKISSMain {
    public static void main(String[] args) {
        System.out.println("Using the Over-engineered Weekday Finder...");
        
        // This is way more complex than it needs to be
        String day = BadKISSWeekdayFinder.find(1);
        
        System.out.println("The day is: " + day);
    }
}
