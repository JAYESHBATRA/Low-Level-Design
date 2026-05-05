package StructuralDesignPatterns.AdapterPattern.XmlToJsonExample.GoodCode;

/**
 * Client: The modern system that only works with the Target interface.
 */
public class ModernAnalyticsTool {
    public void analyzeData(StockDataProvider provider) {
        String jsonData = provider.getStockDataJson();
        System.out.println("Analytics Tool: Analyzing data -> " + jsonData);
    }
}
