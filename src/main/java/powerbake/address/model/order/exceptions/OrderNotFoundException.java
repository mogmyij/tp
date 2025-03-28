package powerbake.address.model.order.exceptions;

/**
 * Signals that the operation is unable to find the specified order.
 */
public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException() {
        super("Order could not be found");
    }
}
