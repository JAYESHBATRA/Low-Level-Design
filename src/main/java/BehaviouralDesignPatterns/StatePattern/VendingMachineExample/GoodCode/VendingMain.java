package BehaviouralDesignPatterns.StatePattern.VendingMachineExample.GoodCode;

public class VendingMain {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(2);

        System.out.println("--- Vending Machine Demo ---");
        
        machine.insertCoin();
        machine.pressButton();

        System.out.println("\n--- Second Purchase ---");
        machine.insertCoin();
        machine.pressButton();

        System.out.println("\n--- Third Attempt (Should be Sold Out) ---");
        machine.insertCoin();
        machine.pressButton();
    }
}
