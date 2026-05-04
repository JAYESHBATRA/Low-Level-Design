package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

public class SoldOutState implements State {
    VendingMachine machine;

    public SoldOutState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertCoin() { System.out.println("You can't insert a coin, the machine is sold out."); }

    @Override
    public void ejectCoin() { System.out.println("You can't eject, you haven't inserted a coin yet."); }

    @Override
    public void pressButton() { System.out.println("You pressed, but there are no products."); }

    @Override
    public void dispense() { System.out.println("No product dispensed."); }
}
