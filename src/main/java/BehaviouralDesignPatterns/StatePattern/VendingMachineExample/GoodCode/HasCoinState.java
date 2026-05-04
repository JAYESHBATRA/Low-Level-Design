package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

public class HasCoinState implements State {
    VendingMachine machine;

    public HasCoinState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertCoin() { System.out.println("You can't insert another coin."); }

    @Override
    public void ejectCoin() {
        System.out.println("Coin returned.");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed...");
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispense() { System.out.println("No product dispensed yet."); }
}
