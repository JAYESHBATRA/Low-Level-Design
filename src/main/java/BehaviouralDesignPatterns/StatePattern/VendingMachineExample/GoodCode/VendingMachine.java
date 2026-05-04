package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

/**
 * Context Class: VendingMachine
 */
public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State dispensingState;
    private State soldOutState;

    private State currentState;
    private int count = 0;

    public VendingMachine(int itemCount) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        soldOutState = new SoldOutState(this);

        this.count = itemCount;
        if (itemCount > 0) {
            currentState = noCoinState;
        } else {
            currentState = soldOutState;
        }
    }

    // Actions delegate to current state
    public void insertCoin() { currentState.insertCoin(); }
    public void ejectCoin() { currentState.ejectCoin(); }
    public void pressButton() { 
        currentState.pressButton(); 
        currentState.dispense();
    }

    // State Transition Helper
    void setState(State state) { this.currentState = state; }

    // Getters for states
    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getDispensingState() { return dispensingState; }
    public State getSoldOutState() { return soldOutState; }

    public int getCount() { return count; }
    void releaseItem() {
        if (count > 0) {
            System.out.println("A product is rolling out...");
            count--;
        }
    }
}
