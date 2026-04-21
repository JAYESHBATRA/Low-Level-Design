/**
 * VIOLATION OF KISS (Keep It Simple, Stupid)
 * 
 * This is "Over-engineering". 
 * 
 * Instead of a simple lookup, we have created:
 * 1. An interface
 * 2. A factory class
 * 3. Multiple implementation paths
 * 4. Exception handling for trivial cases
 * 
 * This makes a very simple task extremely hard to follow.
 */
interface DayFinder {
    String getDayName(int index);
}

class ComplexWeekdayFinder implements DayFinder {
    @Override
    public String getDayName(int index) {
        if (index < 0 || index > 6) {
            throw new IllegalArgumentException("Index out of bounds for the week");
        }
        
        // Unnecessarily complex way to handle a 7-item list
        java.util.Map<Integer, String> dayMap = new java.util.HashMap<>();
        dayMap.put(0, "Sunday");
        dayMap.put(1, "Monday");
        dayMap.put(2, "Tuesday");
        dayMap.put(3, "Wednesday");
        dayMap.put(4, "Thursday");
        dayMap.put(5, "Friday");
        dayMap.put(6, "Saturday");
        
        return dayMap.get(index);
    }
}

class DayFinderFactory {
    public static DayFinder createFinder() {
        return new ComplexWeekdayFinder();
    }
}

public class BadKISSWeekdayFinder {
    public static String find(int day) {
        DayFinder finder = DayFinderFactory.createFinder();
        return finder.getDayName(day);
    }
}
