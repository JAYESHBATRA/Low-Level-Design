package StructuralDesignPatterns.AdapterPattern.XmlToJsonExample.GoodCode;

/**
 * Adaptee: The legacy class with an incompatible interface.
 */
public class LegacyXmlProvider {
    public String getXmlData() {
        return "<stock><symbol>AAPL</symbol><price>150.0</price></stock>";
    }
}
