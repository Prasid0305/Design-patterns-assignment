package assignment.factory;
/**
 * PushNotification is a concrete implementation
 * of the Notification interface.
 *
 * It represents sending notifications via
 * push notification service.
 */
public class PushNotification implements Notification {
    /**
     * Sends a push notification.
     * A delay is added to simulate network latency.
     */
    @Override
    public void sendNotification() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("push notification alert ");
    }
}
