package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

public class OrderCancelledState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Cannot proceed with a cancelled order.");
    }

    @Override
    public void prev(Order order) {
        System.out.println("Cannot revert a cancelled order.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Order Cancelled.");
    }
}
