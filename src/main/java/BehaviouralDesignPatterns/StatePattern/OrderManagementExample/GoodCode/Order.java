package BehaviouralDesignPatterns.StatePattern.OrderManagementExample.GoodCode;

/**
 * Context Class: Order
 */
public class Order {
    private OrderState state;

    public Order() {
        this.state = new OrderPlacedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public void cancelOrder() {
        state.cancel(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
