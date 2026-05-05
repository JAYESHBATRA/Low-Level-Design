package StructuralDesignPatterns.AdapterPattern.XmlToJsonExample.GoodCode;

/**
 * Adapter: Bridges the gap between XML and JSON.
 */
public class XmlToJsonAdapter implements StockDataProvider {
    private LegacyXmlProvider xmlProvider;

    public XmlToJsonAdapter(LegacyXmlProvider xmlProvider) {
        this.xmlProvider = xmlProvider;
    }

    @Override
    public String getStockDataJson() {
        String xmlData = xmlProvider.getXmlData();
        
        // Logic to convert XML to JSON (Simplified for demo)
        System.out.println("Adapter: Converting XML to JSON...");
        
        String symbol = extractValue(xmlData, "symbol");
        String price = extractValue(xmlData, "price");
        
        return String.format("{ \"symbol\": \"%s\", \"price\": %s }", symbol, price);
    }

    private String extractValue(String xml, String tag) {
        String startTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";
        int start = xml.indexOf(startTag) + startTag.length();
        int end = xml.indexOf(endTag);
        return xml.substring(start, end);
    }
}
