package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

public class OrderMain {
    public static void main(String[] args) {
        Order myOrder = new Order();

        System.out.println("--- Order Tracking Demo ---");
        myOrder.printStatus();

        myOrder.nextState();
        myOrder.printStatus();

        System.out.println("\n--- Attempting Illegal Cancellation ---");
        myOrder.cancelOrder(); // Should fail because it's already shipped

        myOrder.nextState();
        myOrder.printStatus();

        System.out.println("\n--- Final Status ---");
        myOrder.nextState();
    }
}
