package StructuralDesignPatterns.AdapterPattern.XmlToJsonExample.GoodCode;

public class AdapterMain {
    public static void main(String[] args) {
        // 1. We have a legacy provider
        LegacyXmlProvider legacyProvider = new LegacyXmlProvider();
        
        // 2. We wrap it in an adapter so it looks like the target interface
        StockDataProvider adapter = new XmlToJsonAdapter(legacyProvider);
        
        // 3. The modern tool can now work with the legacy provider seamlessly
        ModernAnalyticsTool tool = new ModernAnalyticsTool();
        
        System.out.println("--- Good Adapter Pattern Demo ---");
        tool.analyzeData(adapter);
    }
}
