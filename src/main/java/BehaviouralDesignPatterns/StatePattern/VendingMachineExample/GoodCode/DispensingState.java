package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

public class DispensingState implements State {
    VendingMachine machine;

    public DispensingState(VendingMachine machine) { this.machine = machine; }

    @Override
    public void insertCoin() { System.out.println("Please wait, we're already giving you a product."); }

    @Override
    public void ejectCoin() { System.out.println("Sorry, you already pressed the button."); }

    @Override
    public void pressButton() { System.out.println("Pressing twice doesn't get you two products!"); }

    @Override
    public void dispense() {
        machine.releaseItem();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
        } else {
            System.out.println("Oops, out of products!");
            machine.setState(machine.getSoldOutState());
        }
    }
}
