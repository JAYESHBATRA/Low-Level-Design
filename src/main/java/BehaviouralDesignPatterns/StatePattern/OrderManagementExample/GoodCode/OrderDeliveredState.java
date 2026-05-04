package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

public class OrderDeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("This order is already delivered.");
    }

    @Override
    public void prev(Order order) {
        System.out.println("Cannot revert a delivered order.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a delivered order.");
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Order Delivered. Completed.");
    }
}
