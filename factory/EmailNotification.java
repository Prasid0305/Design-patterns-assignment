package assignment.factory;
/**
 * EmailNotification is a concrete implementation
 * of the Notification interface.
 *
 * It represents sending notifications via email.
 */
public class EmailNotification implements Notification{
    /**
     * Sends an email notification.
     */
    @Override
    public void sendNotification() {
        System.out.println("email notification alert");
    }
}
