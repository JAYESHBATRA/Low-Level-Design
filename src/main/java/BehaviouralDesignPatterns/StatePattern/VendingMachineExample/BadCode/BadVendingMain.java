package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.BadCode;

/**
 * VIOLATION: Giant Switch-Case / If-Else logic.
 * Every time a new state is added, we must modify every method in this class.
 */
class BadVendingMachine {
    enum State { NO_COIN, HAS_COIN, SOLD, SOLD_OUT }
    State currentState = State.NO_COIN;
    int inventory = 10;

    public void insertCoin() {
        if (currentState == State.NO_COIN) {
            currentState = State.HAS_COIN;
            System.out.println("Coin inserted.");
        } else if (currentState == State.HAS_COIN) {
            System.out.println("Already has a coin.");
        } else if (currentState == State.SOLD_OUT) {
            System.out.println("Sold out. Please take your coin back.");
        }
    }

    public void pressButton() {
        if (currentState == State.HAS_COIN) {
            currentState = State.SOLD;
            System.out.println("Processing...");
            dispense();
        } else if (currentState == State.NO_COIN) {
            System.out.println("Insert coin first.");
        }
    }

    private void dispense() {
        if (currentState == State.SOLD) {
            inventory--;
            System.out.println("Item dispensed.");
            if (inventory == 0) currentState = State.SOLD_OUT;
            else currentState = State.NO_COIN;
        }
    }
}

public class BadVendingMain {
    public static void main(String[] args) {
        BadVendingMachine machine = new BadVendingMachine();
        machine.insertCoin();
        machine.pressButton();
    }
}
