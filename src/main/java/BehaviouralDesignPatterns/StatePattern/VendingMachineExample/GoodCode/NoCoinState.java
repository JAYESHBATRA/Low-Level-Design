package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

public class NoCoinState implements State {
    VendingMachine machine;

    public NoCoinState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertCoin() {
        System.out.println("You inserted a coin.");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() { System.out.println("You haven't inserted a coin."); }

    @Override
    public void pressButton() { System.out.println("You pressed, but there's no coin."); }

    @Override
    public void dispense() { System.out.println("You need to pay first."); }
}
