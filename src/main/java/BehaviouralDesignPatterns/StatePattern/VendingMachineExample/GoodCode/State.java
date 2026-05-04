package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

/**
 * State Interface
 */
public interface State {
    void insertCoin();
    void ejectCoin();
    void pressButton();
    void dispense();
}
