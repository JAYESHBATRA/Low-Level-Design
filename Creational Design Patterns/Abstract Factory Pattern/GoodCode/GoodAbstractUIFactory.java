/**
 * THE ABSTRACT FACTORY
 * 
 * Defines the contract for creating a "Family" of related products.
 * 
 * Instead of passing strings (like "WINDOWS") to each method, we create 
 * concrete factories for each platfrom. This ensures that a Windows 
 * factory ONLY ever creates Windows products, guaranteeing consistency.
 */
public interface GoodAbstractUIFactory {
    GoodAbstractButton createButton();
    GoodAbstractCheckbox createCheckbox();
}
