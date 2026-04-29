package BehaviouralDesignPatterns.StrategyPattern.GoodCode;


/**
 * Strategy Interface
 * This defines the common interface for all supported payment algorithms.
 */
public interface PaymentStrategy {
    void pay(double amount);
}
