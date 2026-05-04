package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

public class OrderShippedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order delivered!");
        order.setState(new OrderDeliveredState());
    }

    @Override
    public void prev(Order order) {
        System.out.println("Order reverted to Placed state.");
        order.setState(new OrderPlacedState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel order after it has been shipped.");
    }

    @Override
    public void printStatus() {
        System.out.println("Status: Order Shipped. On its way to the customer.");
    }
}
