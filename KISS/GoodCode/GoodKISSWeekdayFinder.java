/**
 * ADHERING TO KISS (Keep It Simple, Stupid)
 * 
 * Instead of factories and interfaces, we just do the simplest 
 * thing that works perfectly.
 */
public class GoodKISSWeekdayFinder {
    public static String getDayName(int index) {
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday"
        };
        
        if (index < 0 || index > 6) {
            return "Invalid Day Index";
        }
        
        return days[index];
    }
}
