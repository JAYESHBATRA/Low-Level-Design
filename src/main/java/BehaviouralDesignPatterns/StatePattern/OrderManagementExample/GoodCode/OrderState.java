package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

/**
 * State Interface
 */
public interface OrderState {
    void next(Order order);
    void prev(Order order);
    void cancel(Order order);
    void printStatus();
}
