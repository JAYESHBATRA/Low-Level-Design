package StructuralDesignPatterns.AdapterPattern.XmlToJsonExample.GoodCode;

/**
 * Target Interface: What our modern system expects.
 */
public interface StockDataProvider {
    String getStockDataJson();
}
