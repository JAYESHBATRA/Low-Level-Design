package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

public class OrderPlacedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order shipped!");
        order.setState(new OrderShippedState());
    }

    @Override
    public void prev(Order order) {
        System.out.println("The order is in its root state.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled successfully.");
        order.setState(new OrderCancelledState());
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Order Placed. Waiting for shipment.");
    }
}
