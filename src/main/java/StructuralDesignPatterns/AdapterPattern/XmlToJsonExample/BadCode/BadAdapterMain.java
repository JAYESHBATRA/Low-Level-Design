package StructuralDesignPatterns.AdapterPattern.XmlToJsonExample.BadCode;

/**
 * Legacy XML Data Provider
 */
class LegacyXmlStockProvider {
    public String getStockDataXml() {
        return "<stock><symbol>AAPL</symbol><price>150.0</price></stock>";
    }
}

/**
 * Modern Analytics Tool (Expects JSON)
 */
class ModernAnalyticsTool {
    public void analyzeData(String jsonData) {
        if (jsonData.startsWith("{")) {
            System.out.println("Analyzing JSON data: " + jsonData);
        } else {
            System.out.println("ERROR: Cannot analyze non-JSON data!");
        }
    }
}

/**
 * VIOLATION: The client code is cluttered with manual conversion logic,
 * or it simply fails because of incompatible interfaces.
 */
public class BadAdapterMain {
    public static void main(String[] args) {
        LegacyXmlStockProvider xmlProvider = new LegacyXmlStockProvider();
        ModernAnalyticsTool analyticsTool = new ModernAnalyticsTool();

        String xmlData = xmlProvider.getStockDataXml();
        
        System.out.println("--- Bad Adapter Demo ---");
        // PROBLEM: The analytics tool cannot accept XML directly.
        analyticsTool.analyzeData(xmlData); 
        
        // Even if we manually convert it here, the client code becomes polluted:
        // String manualJson = convertXmlToJson(xmlData);
        // analyticsTool.analyzeData(manualJson);
    }
}
